package org.knit.solutions.first_semestr.lab11.task25;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileDAO {

    private static final String INSERT_FILE_SQL = "INSERT INTO files (file_name, file_binary) VALUES (?, ?)";

    public void saveFile(File file) throws SQLException, IOException {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT_FILE_SQL)) {

            statement.setString(1, file.getName());  // Имя файла

            // Чтение содержимого файла в бинарный формат
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] fileBytes = new byte[(int) file.length()];
                fis.read(fileBytes);
                statement.setBytes(2, fileBytes);  // Содержимое файла в формате BYTEA
            }

            statement.executeUpdate();  // Выполняем запрос на добавление
        }
    }

    // Метод для получения файла из базы данных
    public File getFile(int id) throws SQLException, IOException {
        String selectSQL = "SELECT file_name, file_binary FROM files WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(selectSQL)) {
            statement.setInt(1, id);
            var resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String fileName = resultSet.getString("file_name");
                byte[] fileData = resultSet.getBytes("file_binary");
                File file = new File(fileName);
                try (var fos = new java.io.FileOutputStream(file)) {
                    fos.write(fileData);
                }
                return file;
            }
        }
        return null;
    }
}

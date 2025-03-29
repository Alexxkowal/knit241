package org.knit.first_semestr.lab11.task25;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class FileProcessor {

    private static final long MAX_FILE_SIZE = 10 * 1024 * 1024;  // 10 MB

    public void processFiles(String path) {
        File fileOrFolder = new File(path);

        if (fileOrFolder.isDirectory()) {
            File[] files = fileOrFolder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.length() < MAX_FILE_SIZE) {
                        try {
                            new FileDAO().saveFile(file);
                            System.out.println("Файл " + file.getName() + " сохранен в базу данных.");
                        } catch (IOException | SQLException e) {
                            System.out.println("Ошибка при сохранении файла " + file.getName() + ": " + e.getMessage());
                        }
                    }
                }
            }
        } else if (fileOrFolder.isFile()) {
            if (fileOrFolder.length() < MAX_FILE_SIZE) {
                try {
                    new FileDAO().saveFile(fileOrFolder);
                    System.out.println("Файл " + fileOrFolder.getName() + " сохранен в базу данных.");
                } catch (IOException | SQLException e) {
                    System.out.println("Ошибка при сохранении файла: " + e.getMessage());
                }

            }
        }
    }

    // Метод для получения списка файлов из базы данных
    public void listFiles() {
        try (Connection connection = DatabaseConnection.getConnection();
             var statement = connection.createStatement();
             var resultSet = statement.executeQuery("SELECT id, file_name FROM files")) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fileName = resultSet.getString("file_name");
                System.out.println("ID: " + id + " | Имя файла: " + fileName);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при выводе файлов: " + e.getMessage());
        }
    }
}

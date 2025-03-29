package org.knit.first_semestr.lab11.task24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
     public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres"; // URL базы данных
        String user = "postgres";  // Имя пользователя
        String password = "secret"; // Пароль

        // Устанавливаем соединение с базой данных
        return DriverManager.getConnection(url, user, password);
    }
}

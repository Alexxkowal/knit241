package org.knit.solutions.first_semestr.lab11.task24;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDatabaseConnection {
    public  void execute() {
        try {
            // Пытаемся установить соединение
            Connection connection = DataBaseConnection.getConnection();

            // Если соединение успешно установлено
            if (connection != null) {
                System.out.println("Соединение с базой данных успешно установлено!");
                connection.close(); // Закрываем соединение
            }
        } catch (SQLException e) {
            // Выводим сообщение об ошибке
            System.out.println("Ошибка при подключении к базе данных:");
            e.printStackTrace();
        }
    }
}

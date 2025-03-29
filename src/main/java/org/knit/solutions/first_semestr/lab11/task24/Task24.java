package org.knit.first_semestr.lab11.task24;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Task24 {
    public  void execute() {
        try (Connection connection = DataBaseConnection.getConnection();
             Scanner scanner = new Scanner(System.in)) {

            UserDAO userDAO = new UserDAOImpl(connection);
            UserService userService = new UserService(userDAO);

            while (true) {
                System.out.println("Введите команду: ");
                String input = scanner.nextLine();
                String[] parts = input.split(" ");

                try {
                    switch (parts[0]) {
                        case "add":
                            userService.registerUser(parts[1], parts[2]);
                            System.out.println("Пользователь добавлен.");
                            break;
                        case "list":
                            userService.listAllUsers().forEach(user ->
                                System.out.println(user.getId() + " " + user.getName() + " " + user.getEmail()));
                            break;
                        case "delete":
                            userService.deleteUser(Integer.parseInt(parts[1]));
                            System.out.println("Пользователь удалён.");
                            break;
                        case "update":
                            userService.updateUser(Integer.parseInt(parts[1]), parts[2], parts[3]);
                            System.out.println("Пользователь обновлён.");
                            break;
                        case "exit":
                            System.out.println("Выход.");
                            return;
                        default:
                            System.out.println("Неизвестная команда.");
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }
        } catch (SQLException e) {
            System.out.println("Ошибка соединения с базой данных.");
            e.printStackTrace();
        }
    }
}

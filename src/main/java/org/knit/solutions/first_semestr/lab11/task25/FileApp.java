package org.knit.solutions.first_semestr.lab11.task25;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class FileApp {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        FileProcessor processor = new FileProcessor();

        while (true) {
            System.out.println("Введите команду (list, saveLocal [id], exit): ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("list")) {
                processor.listFiles();
            } else if (input.startsWith("saveLocal")) {
                String[] parts = input.split(" ");
                if (parts.length == 2) {
                    try {
                        int id = Integer.parseInt(parts[1]);
                        File file = new FileDAO().getFile(id);
                        if (file != null) {
                            System.out.println("Файл " + file.getName() + " сохранен локально.");
                        } else {
                            System.out.println("Файл с таким ID не найден.");
                        }
                    } catch (SQLException | IOException e) {
                        System.out.println("Ошибка при сохранении файла локально: " + e.getMessage());
                    }
                } else {
                    System.out.println("Неверный формат команды.");
                }
            } else {
                System.out.print("Введите путь к файлу или папке: ");
                String path = scanner.nextLine();
                processor.processFiles(path);
            }
        }
    }
}
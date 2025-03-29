package org.knit.solutions.first_semestr.lab8;

import java.util.Scanner;

public class Task13 {
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        int number;
        UserList userList = new UserList();
        while (true){
            System.out.println("Выберите действие: ");
            System.out.println("Новый пользователь - 1");
            System.out.println("Показать всех пользователей - 2");
            System.out.println("Сохранить в файл список - 3");
            System.out.println("Загрузить список из файла - 4");
            System.out.println("Выйти и сохранить - 5");
            number = scanner.nextInt();
            switch (number){
                case (1):
                    System.out.print("Введите имя: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println();
                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    System.out.println("Введите почту: ");
                    String email = scanner.nextLine();
                    User user = new User(name, age, email);
                    userList.addList(user);
                    System.out.println("Пользователь успешно добавлен");
                    break;
                case(2):
                    userList.showList();
                    break;
                case (3):
                    userList.saveInFile();
                    break;
                case (4):
                    userList.loadFromFile();
                    break;
                case (5):
                    userList.saveInFile();
                    System.out.println("Выход");
                    return;
            }
        }
    }
}

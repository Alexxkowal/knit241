package org.knit.solutions.first_semestr.lab6.task11;

import java.util.Scanner;

public class Task11 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        int number;
        StudentList studentList = new StudentList();
        System.out.println("Меню:\n1. Добавить студента\n2. Удалить студента\n3. Показать всех студентов\n4. Найти студента\n5. Выйти");

        while (true) {
            System.out.print("Введите цифру: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine();
                switch (number) {
                    case (1):
                        System.out.println("Выбрана опция 1");
                        System.out.println("Введите студента для добавления");
                        String case1 = scanner.nextLine();
                        Student student = new Student(case1);
                        studentList.addStudent(student);
                        break;
                    case (2):
                        System.out.println("Выбрана опция 2");
                        System.out.println("Введите студента для удаления");
                        String[] case2 = scanner.nextLine().split(" ");
                        studentList.removeStudent(case2[0], case2[1]);
                        break;
                    case (3):
                        System.out.println("Выбрана опция 3");
                        studentList.showStudents();
                        break;
                    case (4):
                        System.out.println("Выбрана опция 4");
                        System.out.println("Введите студента для поиска");
                        String[] case4 = scanner.nextLine().split(" ");
                        studentList.findStudent(case4[0], case4[1]);
                        break;
                    case (5):
                        System.out.println("Выход");
                        return;
                    default:
                        System.out.println("Неправильная цифра!!");
                        break;
                }

            } else {
                System.out.println("Введите корректное число");
                scanner.nextLine();
            }
        }
    }
}

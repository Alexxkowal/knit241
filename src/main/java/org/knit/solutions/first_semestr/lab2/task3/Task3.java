package org.knit.first_semestr.lab2.task3;

import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String sfirst = scanner.nextLine();
        while (!Objects.equals(sfirst, "exit")) {
            double first = Double.parseDouble(sfirst);
            System.out.print("Введите второе число: ");
            double second = Double.parseDouble(scanner.nextLine());
            System.out.print("Введите операцию: ");
            String operation = scanner.nextLine();
            Calculator calculator = new Calculator(first, second);
            switch (operation) {
                case ("+"):
                    System.out.println(calculator.add(first, second));
                    break;
                case ("-"):
                    System.out.println(calculator.subtract(first, second));
                    break;
                case ("*"):
                    System.out.println(calculator.multiply(first, second));
                    break;
                case ("/"):
                    try {
                        System.out.println(calculator.divide(first, second));
                    }
                    catch (ArithmeticException e){
                        System.out.println("Нельзя делить на 0!!");
                    }
                    break;
                default:
                    System.out.println("Введена неправильная операция!!");
            }
            System.out.print("Введите первое число: ");
            sfirst = scanner.nextLine();
        }
        System.out.println("Программа завершена!");
    }
}

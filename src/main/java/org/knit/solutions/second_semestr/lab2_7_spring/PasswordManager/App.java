package org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.service.PasswordService;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.config.AppConfig;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.security.MasterPasswordHolder;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Scanner scanner = new Scanner(System.in);
        PasswordService passwordService = context.getBean(PasswordService.class);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            context.getBean(MasterPasswordHolder.class).clear();
            passwordService.saveEntries();
        }));

        System.out.print("Введите мастер-пароль: ");
        char[] masterPassword = System.console() != null
                ? System.console().readPassword()
                : scanner.nextLine().toCharArray();
        context.getBean(MasterPasswordHolder.class).setMasterPassword(masterPassword);

        String command;
        while (true) {
            System.out.print("\nВведите команду (add, list, copy <site>, delete <site>, exit): ");
            command = scanner.nextLine();
            if (command.equals("exit")) break;
            passwordService.handleCommand(command, scanner);
        }

        context.close();
    }
}

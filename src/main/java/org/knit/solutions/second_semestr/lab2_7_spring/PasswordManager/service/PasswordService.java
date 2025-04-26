package org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.service;

import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.crypto.EncryptionService;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.model.PasswordEntry;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.repository.PasswordRepository;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.clipboard.ClipboardService;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.security.MasterPasswordHolder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class PasswordService {
    @Autowired
    private PasswordRepository repository;
    @Autowired
    private EncryptionService encryptionService;
    @Autowired
    private ClipboardService clipboardService;
    @Autowired
    private MasterPasswordHolder masterPasswordHolder;

    public void handleCommand(String command, Scanner scanner) {
        if (command.equals("add")) {
            System.out.print("Сайт: ");
            String site = scanner.nextLine();
            System.out.print("Логин: ");
            String login = scanner.nextLine();
            System.out.print("Пароль: ");
            String password = scanner.nextLine();

            byte[] encrypted = encryptionService.encrypt(password, masterPasswordHolder.getMasterPassword());
            repository.add(new PasswordEntry(site, login, encrypted));

            System.out.println("Запись добавлена");
        } else if (command.equals("list")) {
            for (PasswordEntry entry : repository.findAll()) {
                System.out.println(entry.getSite() + " - " + entry.getLogin());
            }
        } else if (command.startsWith("copy ")) {
            String site = command.substring(5);
            PasswordEntry entry = repository.findBySite(site);
            if (entry == null) {
                System.out.println("Сайт не найден");
                return;
            }
            String decrypted = encryptionService.decrypt(entry.getEncryptedPassword(), masterPasswordHolder.getMasterPassword());
            clipboardService.copyToClipboard(decrypted);
            System.out.println("Пароль скопирован в буфер обмена");
        } else if (command.startsWith("delete ")) {
            String site = command.substring(7);
            repository.delete(site);
            System.out.println("Запись удалена");
        } else {
            System.out.println("Неизвестная команда");
        }
    }

    public void saveEntries() {
        repository.save();
    }
}
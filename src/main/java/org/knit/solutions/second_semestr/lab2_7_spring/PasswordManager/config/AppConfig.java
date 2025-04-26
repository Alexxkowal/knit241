package org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.config;

import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.clipboard.ClipboardService;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.clipboard.SystemClipboardService;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.crypto.AesEncryptionService;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.crypto.EncryptionService;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.repository.InMemoryPasswordRepository;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.repository.PasswordRepository;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.security.MasterPasswordHolder;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.service.PasswordService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PasswordRepository passwordRepository() {
        return new InMemoryPasswordRepository();
    }

    @Bean
    public EncryptionService encryptionService() {
        return new AesEncryptionService();
    }

    @Bean
    public ClipboardService clipboardService() {
        return new SystemClipboardService();
    }

    @Bean
    public MasterPasswordHolder masterPasswordHolder() {
        return new MasterPasswordHolder();
    }

    @Bean
    public PasswordService passwordService() {
        return new PasswordService();
    }
}
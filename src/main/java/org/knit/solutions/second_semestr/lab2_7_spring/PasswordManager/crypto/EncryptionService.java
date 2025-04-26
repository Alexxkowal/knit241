package org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.crypto;

public interface EncryptionService {
    byte[] encrypt(String data, char[] password);
    String decrypt(byte[] data, char[] password);
}
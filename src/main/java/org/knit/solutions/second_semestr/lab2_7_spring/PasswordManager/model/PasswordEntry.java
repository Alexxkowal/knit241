package org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.model;

public class PasswordEntry {
    private String site;
    private String login;
    private byte[] encryptedPassword;

    public PasswordEntry(String site, String login, byte[] encryptedPassword) {
        this.site = site;
        this.login = login;
        this.encryptedPassword = encryptedPassword;
    }

    public PasswordEntry(){}

    public String getSite() {
        return site;
    }

    public String getLogin() {
        return login;
    }

    public byte[] getEncryptedPassword() {
        return encryptedPassword;
    }
}

package org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.security;

public class MasterPasswordHolder {
    private char[] masterPassword;

    public void setMasterPassword(char[] masterPassword) {
        this.masterPassword = masterPassword;
    }

    public char[] getMasterPassword() {
        return masterPassword;
    }

    public void clear() {
        if (masterPassword != null) {
            for (int i = 0; i < masterPassword.length; i++) {
                masterPassword[i] = 0;
            }
        }
    }
}

package org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.repository;

import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.model.PasswordEntry;

import java.util.List;

public interface PasswordRepository {
    void add(PasswordEntry passwordEntry);

    void delete(String site);

    PasswordEntry findBySite(String site);

    List<PasswordEntry> findAll();

    void save();

}

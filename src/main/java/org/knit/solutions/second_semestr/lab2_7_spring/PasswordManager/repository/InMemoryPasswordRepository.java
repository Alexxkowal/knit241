package org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.knit.solutions.second_semestr.lab2_7_spring.PasswordManager.model.PasswordEntry;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryPasswordRepository implements PasswordRepository {

    private HashMap<String, PasswordEntry> entries = new HashMap<>();
    private static final String FILE_PATH = "passwords.json";

    public InMemoryPasswordRepository() {
        load();
    }

    @Override
    public void add(PasswordEntry passwordEntry) {
        entries.put(passwordEntry.getSite(), passwordEntry);
    }

    @Override
    public void delete(String site) {
        entries.remove(site);
    }

    @Override
    public PasswordEntry findBySite(String site) {
        return entries.get(site);
    }

    @Override
    public List<PasswordEntry> findAll() {
        return new ArrayList<>(entries.values());
    }

    @Override
    public void save() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(FILE_PATH), entries.values());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void load() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            PasswordEntry[] loaded = mapper.readValue(new File(FILE_PATH), PasswordEntry[].class);
            for (PasswordEntry entry : loaded) {
                entries.put(entry.getSite(), entry);
            }
        } catch (Exception ignored) {
        }
    }
}



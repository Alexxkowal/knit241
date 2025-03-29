package org.knit.solutions.first_semestr.lab8;

import java.io.Serializable;

public class User implements Serializable {
    private final String name;
    private  int age;
    private final String email;
    public User(String name, int age, String email)
    {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name+" "+ age+" "+ email;
    }
}

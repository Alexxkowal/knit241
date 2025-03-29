package org.knit.first_semestr.lab9.task17;

public class User {
    @NotNull
    private final String name;

    @MaxLength(10)
    private  String username;

    @Min(18)
    private Integer age;

    public User(String name, String username, Integer age) {
        this.name = name;
        this.username = username;
        this.age = age;
    }
}

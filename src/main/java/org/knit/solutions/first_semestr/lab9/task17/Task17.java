package org.knit.first_semestr.lab9.task17;

import java.util.List;

public class Task17 {
    public static void execute(){
        User user = new User(null, "verylongusername", 15);

        List<String> errors = Validator.validate(user);

        if (errors.isEmpty()) {
            System.out.println("Validation passed!");
        } else {
            System.out.println("Validation errors:");
            errors.forEach(System.out::println);
        }
    }
}

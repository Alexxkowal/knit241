package org.knit.solutions.first_semestr.lab9.task17;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    public static List<String> validate(Object obj) {
        List<String> errors = new ArrayList<>();
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            try {
                Object value = field.get(obj);

                if (field.isAnnotationPresent(NotNull.class) && value == null) {
                    errors.add(field.getName() + " must not be null.");
                }

                // Проверка @MaxLength
                if (field.isAnnotationPresent(MaxLength.class) && value instanceof String) {
                    int maxLength = field.getAnnotation(MaxLength.class).value();
                    if (((String) value).length() > maxLength) {
                        errors.add(field.getName() + " length must not exceed " + maxLength + " characters.");
                    }
                }

                // Проверка @Min
                if (field.isAnnotationPresent(Min.class) && value instanceof Integer) {
                    int minValue = field.getAnnotation(Min.class).value();
                    if ((Integer) value < minValue) {
                        errors.add(field.getName() + " must be at least " + minValue + ".");
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return errors;
    }
}
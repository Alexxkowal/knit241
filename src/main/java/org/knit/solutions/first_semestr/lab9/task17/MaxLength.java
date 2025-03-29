package org.knit.solutions.first_semestr.lab9.task17;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Аннотация доступна во время выполнения программы
@Target(ElementType.FIELD)          // Аннотация применяется к полям
public @interface MaxLength {
    int value(); // Параметр аннотации для задания максимальной длины
}

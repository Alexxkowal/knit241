package org.knit.solutions.first_semestr.lab10.task21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task21 {
    public void exevute(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = filter(numbers, num -> num % 2 == 0);
        System.out.println("Even numbers: " + evenNumbers);

        List<String> words = List.of("apple", "banana", "cherry", "date");
        List<String> longWords = filter(words, word -> word.length() > 5);
        System.out.println("Long words: " + longWords);
    }

    public  <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}

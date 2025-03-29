package org.knit.first_semestr.lab5.task9;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task9 {
    public static final long TIMEOUT = 10000;


    public void execute() throws FileNotFoundException {
        Words words = new Words("data/dictionary.txt");
        long timeMillis = System.currentTimeMillis();
        long endTime = timeMillis + TIMEOUT;
        Keyboard keyboard = new Keyboard();
        Scanner scanner = new Scanner(System.in);
        while (System.currentTimeMillis() < endTime && words.getWord() != null) {
            boolean flag = false;
            String word = words.getWord();
            System.out.println(word);
            String inputWord = scanner.nextLine();
            if (word.equals(inputWord)) {
                flag = true;
                keyboard.inputWord(word, flag);
            } else {
                keyboard.inputWord(word, flag);
            }
        }
        System.out.println(keyboard.result());
    }
}

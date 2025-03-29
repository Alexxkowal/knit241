package org.knit.solutions.first_semestr.lab6.task10;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task10 {
    public static void execute() throws FileNotFoundException {
        WordLogic wordLogic = new WordLogic("data/dictionary.txt");
        String word = wordLogic.getRandomWord();
        GameLogic gameLogic = new GameLogic(word);
        System.out.println(word);
        int tryCount = 0;
        gameLogic.printCurrent();
        Scanner scanner = new Scanner(System.in);
        int tryMax = gameLogic.getWordSet().size() + 3;
        while (tryCount < tryMax) {
            System.out.println("Осталось попыток: " + (tryMax - tryCount));
            System.out.println("Введите букву: ");
            char ch = scanner.nextLine().toCharArray()[0];
            int ans = gameLogic.getChar(ch);
            if (ans == 2) {
                gameLogic.printCurrent();
                break;
            }
            if (ans == 1 || ans == 0) {
                tryCount += 1;
            }
            gameLogic.printCurrent();
            if (tryCount == tryMax) {
                System.out.println("Вы проиграли!!");
                System.out.print("Ответ: ");
                System.out.println(word);
            }
        }
    }
}

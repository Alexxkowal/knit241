package org.knit.solutions.first_semestr.lab6.task10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class GameLogic {
    private final int wordLength;
    private HashSet<Character> inputChars;
    private final HashSet<Character> wordSet;

    private char[] wordsChar;
    private List<Character> current;

    public GameLogic(String word) {
        this.wordsChar = word.toCharArray();
        this.wordLength = wordsChar.length;
        this.inputChars = new HashSet<>();  // Инициализация inputChars
        this.current = new ArrayList<>();   // Инициализация current
        this.wordSet = new HashSet<>();
        makeCurr(wordLength);
        makeWordSet(wordsChar);
    }

    public void makeCurr(int wordLength) {
        for (int i = 0; i < wordLength; i++) {
            current.add('_');
        }
    }

    public int getChar(char ch) {
        boolean flag = true;
        if (inputChars.contains(ch))
        {
            System.out.println("Буква уже введена!");
            return -1;
        }
        else
        {
            inputChars.add(ch);
            for (int i = 0; i < wordLength; i++) {
                if (wordsChar[i] == ch) {
                    flag = false;
                    current.set(i, ch);  // Используем set для замены
                }
            }
                if (flag) {
                    System.out.println("Такой буквы нет!");
                    return 0;
                }
                if (inputChars.containsAll(wordSet) && inputChars.size() >= wordSet.size()) {
                    System.out.println("Вы выиграли!");
                    return 2;
                }
            }
        return 1;
    }
    public void printCurrent()
    {
        for (Character ch  : current)
        {
            System.out.print(ch);
        }
        System.out.println();
    }
    public void makeWordSet(char[] word)
    {
        for (Character ch: word)
        {
            wordSet.add(ch);
        }
    }
    public HashSet<Character> getWordSet()
    {
        return wordSet;
    }
}

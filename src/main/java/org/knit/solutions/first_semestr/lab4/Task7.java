package org.knit.solutions.first_semestr.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void execute() throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("src/main/java/org/knit/lab4/dictionary.txt"));
    ArrayList <String> arrayList = new ArrayList<>();
    while (scanner.hasNext()) {
        String word = scanner.nextLine();
        arrayList.add(word);
    }
    char[] russianAlphabet = new char[32];

        // Используем цикл for для добавления букв алфавита
        for (char ch = 'а'; ch <= 'я'; ch++) {
            russianAlphabet[ch - 'а'] = ch;  // Заполняем массив
        }
    String[] array = arrayList.toArray(new String[0]);
    DictionaryStatistics dictionaryStatistics = new DictionaryStatistics(array, russianAlphabet);
    scanner.close();
    System.out.println(dictionaryStatistics.getPolindrom());
    System.out.println(dictionaryStatistics.getMaxWordLength());
    dictionaryStatistics.printAlphabet();
    System.out.println(dictionaryStatistics.getDictionarySize());
    dictionaryStatistics.printSymbolStat();
    System.out.println(dictionaryStatistics.getRandomWord());
    dictionaryStatistics.wordGame("крот");

}
}

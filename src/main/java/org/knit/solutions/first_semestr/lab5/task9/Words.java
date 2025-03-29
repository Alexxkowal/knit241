package org.knit.solutions.first_semestr.lab5.task9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Words {
    private final Iterator <String> iterator;

    public Words(String path) throws FileNotFoundException {
        List<String> words = getWords(path);
        this.iterator = words.iterator();
    }
    public static List<String> getWords(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }
        scanner.close();
        Collections.shuffle(words);
        return words;
    }
    public String getWord()
    {
        if (iterator.hasNext())
        {
            return iterator.next();
        }
        System.out.println("Слов больше нет!");
        return null;
    }
}

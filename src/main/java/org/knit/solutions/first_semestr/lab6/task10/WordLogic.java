package org.knit.first_semestr.lab6.task10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class WordLogic {
    private final List<String > words;
    private final Random random = new Random();
    public WordLogic (String path) throws FileNotFoundException {
        this.words = getWords(path);
        }

    public static List<String> getWords(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            String word = scanner.nextLine();
            if (word.toCharArray().length >=4)
            {
                words.add(word);
            }
        }
        scanner.close();
        Collections.shuffle(words);
        return words;
    }
    public String getRandomWord()
    {
        int index = random.nextInt(words.size());
        return words.get(index);
    }
}

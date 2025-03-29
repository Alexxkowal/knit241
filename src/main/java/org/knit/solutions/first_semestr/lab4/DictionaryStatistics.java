package org.knit.first_semestr.lab4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DictionaryStatistics {
    private String[] words;
    private int dictionarySize;
    private int polindrom;
    private int maxWordLength;
    private int minWordLength;
    private char[] alphabet;
    private int[] frequency;

    public DictionaryStatistics(String[] words, char[] alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        this.dictionarySize = words.length;
        this.minWordLength = DictionaryStatisticsFabric.getWordMinLen(words);
        this.maxWordLength = DictionaryStatisticsFabric.getWordMaxLen(words);
        this.polindrom = DictionaryStatisticsFabric.getPolindrom(words);
        this.dictionarySize = DictionaryStatisticsFabric.getDictionarySize(words);
        this.frequency = DictionaryStatisticsFabric.getFrequency(words, alphabet);
    }
    public int getPolindrom(){
        return polindrom;
    }
    public int getMaxWordLength(){
        return maxWordLength;
    }
    public int getMinWordLength(){
        return minWordLength;
    }
    public void printAlphabet()
    {
        for (char ch: alphabet)
        {
            System.out.print(ch);
            System.out.print(' ');
        }
        System.out.println();
    }
    public int getDictionarySize()
    {
        return dictionarySize;
    }
    public void printSymbolStat(){
        for (int i =0; i< alphabet.length; i++)
        {
            System.out.print(alphabet[i]);
            System.out.print(' ');
            System.out.print(frequency[i]);
            System.out.println();
        }
    }
    public String getRandomWord(){
        int n = (int)Math.floor(Math.random() * words.length);
        return words[n];
    }
    public void wordGame(String word)
    {
     HashMap<Character, Integer> wordCharCount = makeHashMap(word);
     for (String dictWord: words)
     {
         HashMap<Character, Integer> dictWordCharCount = makeHashMap(dictWord);
         if (wordCharCount.keySet().containsAll(dictWordCharCount.keySet()))
         {
             boolean flag = true;
             for (Map.Entry<Character, Integer> entry: wordCharCount.entrySet())
             {
                 Character key = entry.getKey();
                 Integer value1 = wordCharCount.getOrDefault(key, 0);
                 Integer value2 = dictWordCharCount.getOrDefault(key, 0);
                 if (value1 < value2)
                 {
                     flag = false;
                     break;
                 }
             }
             if (flag)
             {
                 System.out.println(dictWord);
             }
         }
     }
    }
    private HashMap <Character, Integer> makeHashMap(String word)
    {
        HashMap <Character, Integer> charCountMap = new HashMap<>();
        for (char ch: word.toCharArray())
        {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        return charCountMap;
    }
}

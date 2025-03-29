package org.knit.first_semestr.lab5.task9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//пример
public class Keyboard {
    int wordsCount;
    int score;
    int symbolCount;
    double speed;
    public Keyboard()
    {
        this.wordsCount = 0;
        this.score = 0;
        this.symbolCount = 0;
        this.speed = 0;
    }
    public void inputWord(String word, boolean flag)
    {
     wordsCount++;
     if (flag)
     {
         score++;
     }
     symbolCount += word.toCharArray().length;
    }

    public int getScore() {
        return score;
    }
    public String result()
    {
        String result = "Количество слов " +  wordsCount + '\n' +
                "Счет " + score + '\n' +
                "Количество символов " + symbolCount + '\n' +
                "Символы в секунду " + symbolCount / 60.0;
        return result;
    }

}
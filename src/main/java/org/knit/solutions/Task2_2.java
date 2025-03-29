package org.knit.solutions;

import org.knit.solutions.second_semestr.lab2_1.task2.Coffee;
import org.knit.solutions.second_semestr.lab2_1.task2.Latte;
import org.knit.solutions.second_semestr.lab2_1.task2.Marshmellow;

public class Task2_2 {
    public void execute(){
        Coffee latte = new Latte();
        System.out.println(latte.getDescription() + " " + latte.getCalories() +" " + latte.getCost());
        latte = new Marshmellow(latte);
        System.out.println(latte.getDescription() + " " + latte.getCalories() + " " + latte.getCost());
    }
}

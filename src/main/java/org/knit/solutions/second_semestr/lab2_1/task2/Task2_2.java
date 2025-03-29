package org.knit.second_semestr.lab2_1.task2;

public class Task2_2 {
    public void execute(){
        Coffee latte = new Latte();
        System.out.println(latte.getDescription() + " " + latte.getCalories() +" " + latte.getCost());
        latte = new Marshmellow(latte);
        System.out.println(latte.getDescription() + " " + latte.getCalories() + " " + latte.getCost());
    }
}

package org.knit.solutions.second_semestr.lab2_1.task2;

public class Espresso implements Coffee{
    @Override
    public double getCost() {
        return 50;
    }
    public String getDescription(){
        return "Эспрессо";
    }
    public double getCalories(){
        return 12.5;
    }
}

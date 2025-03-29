package org.knit.solutions.second_semestr.lab2_1.task2;

public class Raf implements Coffee{
    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Раф";
    }

    @Override
    public double getCalories() {
        return 40.5;
    }
}

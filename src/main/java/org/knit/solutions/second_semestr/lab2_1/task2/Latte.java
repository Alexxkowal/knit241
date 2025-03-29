package org.knit.second_semestr.lab2_1.task2;

public class Latte implements Coffee{

    @Override
    public double getCost() {
        return 75;
    }

    @Override
    public String getDescription() {
        return "Латте";
    }

    @Override
    public double getCalories() {
        return 25;
    }
}

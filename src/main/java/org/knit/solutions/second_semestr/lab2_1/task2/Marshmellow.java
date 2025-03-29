package org.knit.solutions.second_semestr.lab2_1.task2;

public class Marshmellow extends CoffeeDecorator{

    public Marshmellow(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + ", маршмеллоу";
    }
    @Override
    public double getCalories(){
        return super.getCalories() + 100;
    }
}

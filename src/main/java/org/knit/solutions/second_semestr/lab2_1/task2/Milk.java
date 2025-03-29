package org.knit.solutions.second_semestr.lab2_1.task2;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost(){
        return super.getCost() + 20;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + ", молоко";
    }
    @Override
    public double getCalories(){
        return super.getCalories() + 30;
    }
}

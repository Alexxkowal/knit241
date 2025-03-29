package org.knit.second_semestr.lab2_1.task2;

public  class SizeDecorator implements Coffee {
    Coffee coffee;
    public SizeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCalories() {
        return coffee.getCalories();
    }
}

package org.knit.second_semestr.lab2_1.task2;

public class Medium extends SizeDecorator{
    public Medium(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }

    @Override
    public double getCalories() {
        return super.getCalories() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", средний размер";
    }
}

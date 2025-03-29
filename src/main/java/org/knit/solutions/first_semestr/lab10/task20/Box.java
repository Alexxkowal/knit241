package org.knit.solutions.first_semestr.lab10.task20;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number> {
    List<T> numbers;
    public Box(){
        this.numbers = new ArrayList<T>();
    }
    public void addNumber(T number){
        numbers.add(number);
    }
    public double getSum(){
        double sum = 0;
        for (T number : numbers){
            sum += number.doubleValue();
        }
        return sum;
    }
}

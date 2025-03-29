package org.knit.first_semestr.lab10.task20;

public class Task20 {
    public void execute(){
        Box<Integer> intBox = new Box<>();
        intBox.addNumber(5);
        intBox.addNumber(100);
        System.out.println(intBox.getSum());
        Box<Double> doubleBox = new Box<>();
        doubleBox.addNumber(1.5);
        doubleBox.addNumber(2.5);
        doubleBox.addNumber(3.0);
        System.out.println("Сумма (Double): " + doubleBox.getSum());
    }
}

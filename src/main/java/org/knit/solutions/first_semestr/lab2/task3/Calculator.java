package org.knit.first_semestr.lab2.task3;

public class Calculator {
    double first;
    double second;
    public Calculator(double first_userinput, double second_userinput){
         this.first = first_userinput;
         this.second = second_userinput;
    }
    public double add (double first, double second){
        return first + second;
    }
    public double subtract (double first, double second){
        return first - second;
    }
    public double multiply (double first, double second){
        return first * second;
    }
    public double divide (double first, double second){
        if (second == 0){
            throw new ArithmeticException("Нельзя делить на 0!");
        }
        return first / second;
    }
    public String toString() {
        return "add:" + add(first, second) + "\n" +
                "substract:" + subtract(first, second) + "\n" +
                "multiply:" + multiply(first, second) + "\n" +
                "divide:" + divide(first, second) + "\n";

    }
}

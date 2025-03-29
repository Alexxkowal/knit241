package org.knit.solutions.first_semestr.lab2.task4;

class Cube extends Shape{
    double side;
    public Cube (double radius, double side){
        super (0);
        this.side = side;
    }
    public double getVolume(){
        return Math.pow(side, 3);
    }
}

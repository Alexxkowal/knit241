package org.knit.solutions.first_semestr.lab2.task4;

class Cylinder extends  Shape {
    double height;
    public Cylinder (double radius, double height){
        super (radius);
        this.height = height;
    }
    @Override
    public double getVolume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

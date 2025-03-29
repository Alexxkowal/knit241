package org.knit.solutions.first_semestr.lab2.task4;

class Sphere extends Shape {
    public Sphere(double radius) {
        super(radius);//зачем супер? мы не можем просто объявить?
    }
    @Override
    public double getVolume(){
        return (4.0/3.0)*Math.pow(radius, 3)*Math.PI;
    }
}


package org.knit.solutions.first_semestr.lab2.task4;

public class Container {
    double volume;
    public Container(double volume){
        this.volume = volume;
    }
    public  void add(Shape shape){
    if (volume >= shape.getVolume()){   //почему низя статик?
        volume-= shape.getVolume();
        System.out.println("Успешно добавлено в контейнер");
    }
    else {
        System.out.println("Недостаточно места!!!");
    }
    }
}

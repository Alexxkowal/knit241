package org.knit.second_semestr.lab2_1.task3;

public class Task2_3 {
    public void execute(){
        TransportFactory transportFactory = new TransportFactory();
        Transport buisness = transportFactory.createTransport("buisness");
        Transport bike = transportFactory.createTransport("delivery");
        System.out.println(buisness.getClass());
        System.out.println(bike.getClass());
        Transport wave = transportFactory.createTransport("none");
        System.out.println(bike.getClass());


    }
}

package org.knit.solutions;

import org.knit.solutions.second_semestr.lab2_1.task3.Transport;
import org.knit.solutions.second_semestr.lab2_1.task3.TransportFactory;

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

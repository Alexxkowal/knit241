package org.knit.second_semestr.lab2_2.task2_7;

public class Task2_7 {
    public void execute(){
        Warehouse warehouse = new Warehouse();
        Producer producer = new Producer(warehouse);
        Consumer consumer = new Consumer(warehouse);
        producer.start();
        consumer.start();
    }
}

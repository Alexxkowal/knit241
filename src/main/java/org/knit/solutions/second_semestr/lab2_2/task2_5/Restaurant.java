package org.knit.solutions.second_semestr.lab2_2.task2_5;

import java.util.LinkedList;
import java.util.Queue;

public class Restaurant {
    private final int CAPACITY = 3;
    private Queue<String> mealsQueue = new LinkedList<>();

    public synchronized void addMeal(String name){
        while (mealsQueue.size() >= CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        }
        mealsQueue.add(name);
        System.out.println("Повар приготовил блюдо" + name);
        notify();
    }

    public synchronized void serve(){
        while (mealsQueue.isEmpty()){
            try {
                wait();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("Официант поддал блюдо" + mealsQueue.poll());
    }

}

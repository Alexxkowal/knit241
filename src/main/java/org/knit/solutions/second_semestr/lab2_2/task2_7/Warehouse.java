package org.knit.second_semestr.lab2_2.task2_7;

import java.util.LinkedList;
import java.util.Queue;

class Warehouse {
    private final int CAPACITY = 5;
    private final Queue<Integer> storage = new LinkedList<>();

    public synchronized void produce(int item) {
        while (storage.size() == CAPACITY) {
            try {
                System.out.println("Склад заполнен! Производитель ждет...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        storage.add(item);
        System.out.println("Производитель создал товар " + item);
        notifyAll(); // Будим потребителя
    }

    public synchronized void consume() {
        while (storage.isEmpty()) {
            try {
                System.out.println("Нет товаров! Потребитель ждет...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int item = storage.poll();
        System.out.println("🛒 Потребитель забрал товар " + item);
        notifyAll();
    }
}

package org.knit.second_semestr.lab2_2.task2_8;

class TrafficLight {
    private volatile boolean isGreen = false; // Начинаем с красного

    public synchronized void waitGreen() {
        while (!isGreen) {
            try {
                System.out.println(Thread.currentThread().getName() + " ждет зеленый свет...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " поехал!");
    }

    public synchronized void changeLight() {
        isGreen = !isGreen;
        if (isGreen) {
            System.out.println("Светофор: ЗЕЛЕНЫЙ! Машины могут ехать.");
            notifyAll();
        } else {
            System.out.println("Светофор: КРАСНЫЙ! Машины должны остановиться.");
        }
    }
}
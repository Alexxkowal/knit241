package org.knit.second_semestr.lab2_2.task2_6;

class RailwayCrossing {
    private boolean trainIsComing = false; // Флаг, едет ли поезд

    public synchronized void waitForTrain(String carName) {
        while (trainIsComing) {
            try {
                System.out.println(carName + " ждет, поезд едет...");
                wait(); // Машина ждет, пока поезд не проедет
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(carName + " поехала через переезд!");
    }

    public synchronized void trainArriving() {
        System.out.println("🚆 Поезд приближается! Машины останавливаются...");
        trainIsComing = true;
    }

    public synchronized void trainDeparting() {
        System.out.println("🚆 Поезд уехал! Машины могут ехать.");
        trainIsComing = false;
        notifyAll(); // Будим все машины
    }
}

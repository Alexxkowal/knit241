package org.knit.second_semestr.lab2_2.task2_6;

class Car extends Thread {
    private RailwayCrossing crossing;
    private String carName;

    public Car(RailwayCrossing crossing, String carName) {
        this.crossing = crossing;
        this.carName = carName;
    }

    @Override
    public void run() {
        while (true) { // Бесконечный цикл для машин
            crossing.waitForTrain(carName);
            try {
                Thread.sleep((int) (Math.random() * 3000)); // Машина ездит по городу
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


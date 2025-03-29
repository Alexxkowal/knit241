package org.knit.second_semestr.lab2_2.task2_6;

class Train extends Thread {
    private RailwayCrossing crossing;

    public Train(RailwayCrossing crossing) {
        this.crossing = crossing;
    }

    @Override
    public void run() {
        while (true) { // Бесконечный цикл для поезда
            try {
                Thread.sleep(5000); // Поезд едет где-то далеко
                crossing.trainArriving();
                Thread.sleep(3000); // Поезд проезжает переезд
                crossing.trainDeparting();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}}
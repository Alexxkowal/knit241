package org.knit.solutions.second_semestr.lab2_2.task2_8;

public class Car extends Thread {
    private TrafficLight trafficLight;

    public Car(TrafficLight trafficLight, String name) {
        super(name);
        this.trafficLight = trafficLight;
    }

    @Override
    public void run() {
        while (true) {
            trafficLight.waitGreen();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

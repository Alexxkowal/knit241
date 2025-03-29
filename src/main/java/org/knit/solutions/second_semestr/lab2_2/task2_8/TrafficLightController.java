package org.knit.second_semestr.lab2_2.task2_8;

class TrafficLightController extends Thread {
    private TrafficLight trafficLight;

    public TrafficLightController(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            trafficLight.changeLight();
        }
    }
}
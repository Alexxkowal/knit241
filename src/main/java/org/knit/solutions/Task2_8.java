package org.knit.solutions;

import org.knit.solutions.second_semestr.lab2_2.task2_8.Car;
import org.knit.solutions.second_semestr.lab2_2.task2_8.TrafficLight;
import org.knit.solutions.second_semestr.lab2_2.task2_8.TrafficLightController;

public class Task2_8 {
    public void execute(){
        TrafficLight trafficLight = new TrafficLight();
        TrafficLightController controller = new TrafficLightController(trafficLight);
        controller.start();
        new Car(trafficLight, "Машина 1").start();
        new Car(trafficLight, "Машина 2").start();
        new Car(trafficLight, "Машина 3").start();
    }
}

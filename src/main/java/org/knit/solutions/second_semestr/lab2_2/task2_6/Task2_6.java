package org.knit.second_semestr.lab2_2.task2_6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2_6 {
    public void execute() throws InterruptedException {
        RailwayCrossing crossing = new RailwayCrossing();

        for (int i = 1; i <= 5; i++) {
            new Car(crossing, "🚗 Машина " + i).start();
        }

        Thread.sleep(1000);
        new Train(crossing).start();
    }
}

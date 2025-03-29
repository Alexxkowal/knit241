package org.knit.solutions.second_semestr.lab2_2.task2_4;

import java.util.concurrent.Semaphore;

public class GasStation {
    private final Semaphore semaphore;

    public GasStation(int count){
        this.semaphore = new Semaphore(count);
    }

    public void Refuel(String carName){
        try {
            System.out.println(carName + " машина ждет заправку");
            semaphore.acquire();
            Thread.sleep(2000);
            System.out.println(carName + " заправился и уехал");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            semaphore.release();
        }
    }

}

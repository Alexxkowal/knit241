package org.knit.second_semestr.lab2_3;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;

class Runner implements Runnable {
    private final CyclicBarrier startBarrier;
    private final CyclicBarrier finishBarrier;
    private final int runnerId;
    private final Random random = new Random();

    public Runner(int runnerId, CyclicBarrier startBarrier, CyclicBarrier finishBarrier) {
        this.runnerId = runnerId;
        this.startBarrier = startBarrier;
        this.finishBarrier = finishBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("Бегун " + runnerId + " готовится к старту.");
            startBarrier.await();

            int runTime = ThreadLocalRandom.current().nextInt(500, 3000);
            System.out.println("Бегун " + runnerId + " стартовал и будет бежать " + runTime + " мс.");
            Thread.sleep(runTime);

            System.out.println("Бегун " + runnerId + " финишировал!");
            finishBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println("Бегун " + runnerId + " сошёл с дистанции из-за травмы!");
        }
    }
}

package org.knit.second_semestr.lab2_3;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Race {
    public static void execute(String[] args) {
        final int RUNNERS_COUNT = args.length > 0 ? Integer.parseInt(args[0]) : 5;

        CyclicBarrier startBarrier = new CyclicBarrier(RUNNERS_COUNT, () ->
            System.out.println("Все бегуны готовы! Забег начинается!\n")
        );

        CyclicBarrier finishBarrier = new CyclicBarrier(RUNNERS_COUNT, () ->
            System.out.println("Гонка завершена! Все бегуны финишировали!\n")
        );

        ExecutorService executor = Executors.newFixedThreadPool(RUNNERS_COUNT);
        for (int i = 1; i <= RUNNERS_COUNT; i++) {
            executor.execute(new Runner(i, startBarrier, finishBarrier));
        }

        executor.shutdown();
    }
}

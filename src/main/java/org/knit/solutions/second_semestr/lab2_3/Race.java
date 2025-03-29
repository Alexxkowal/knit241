package org.knit.solutions.second_semestr.lab2_3;

import org.knit.TaskDescription;
import org.knit.solutions.Solution;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Race{
    int count;
    public Race(int count){
        this.count = count;
    }
    public void execute() {
        final int RUNNERS_COUNT = count;

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

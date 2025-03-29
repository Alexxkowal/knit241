package org.knit.solutions.second_semestr.lab2_2.task2_9;

import java.util.concurrent.BlockingQueue;

public class Assembler implements  Runnable{
    private final BlockingQueue<Detail> stampingQueue;
    private final BlockingQueue<Detail> assemblingQueue;
    private int detailID = 0;

    public Assembler(BlockingQueue<Detail> stampingQueue, BlockingQueue<Detail> blockingQueue) {
        this.stampingQueue = stampingQueue;
        this.assemblingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (detailID < 10){
            try {
                Detail detail = stampingQueue.take();
                Thread.sleep(1500);
                assemblingQueue.put(detail);
                System.out.println("Сборщик собрал деталь" + detail.getId());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

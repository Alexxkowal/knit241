package org.knit.second_semestr.lab2_2.task2_9;

import java.util.concurrent.BlockingQueue;

public class Operator implements Runnable{
    private final BlockingQueue<Detail> assemblingQueue;
    private final BlockingQueue<Detail> checkingQueue;

    public Operator(BlockingQueue<Detail> assemblingQueue, BlockingQueue<Detail> checkingQueue) {
        this.assemblingQueue = assemblingQueue;
        this.checkingQueue = checkingQueue;
    }

    @Override
    public void run() {
        while (checkingQueue.size()<10){
            try {
                Detail detail = assemblingQueue.take();
                Thread.sleep(2000);
                checkingQueue.put(detail);
                System.out.println("Проверил деталь " + detail.getId());
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}

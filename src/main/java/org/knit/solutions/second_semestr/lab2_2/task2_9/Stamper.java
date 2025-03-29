package org.knit.solutions.second_semestr.lab2_2.task2_9;

import java.util.concurrent.BlockingQueue;

public class Stamper implements Runnable{
    private int detailID = 0;
   private final  BlockingQueue<Detail> stampingQueue;

    public Stamper(BlockingQueue<Detail> blockingQueue) {
        this.stampingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (detailID < 10){
            try {
                stampingQueue.put(new Detail(++detailID));
                System.out.println("Сделал заготовку");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

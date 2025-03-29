package org.knit.second_semestr.lab2_2.task2_7;

class Consumer extends Thread {
    private Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (true) {
            warehouse.consume();
            try {
                Thread.sleep((int) (Math.random() * 2000)); // Потребление занимает время
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

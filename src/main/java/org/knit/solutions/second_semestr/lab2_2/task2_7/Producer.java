package org.knit.second_semestr.lab2_2.task2_7;

class Producer extends Thread {
    private Warehouse warehouse;
    private int itemCount = 0; // Номер товара

    public Producer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (true) {
            warehouse.produce(++itemCount);
            try {
                Thread.sleep((int) (Math.random() * 1000)); // Производство занимает время
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
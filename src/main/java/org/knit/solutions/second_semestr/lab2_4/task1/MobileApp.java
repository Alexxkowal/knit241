package org.knit.second_semestr.lab2_4.task1;

import java.util.HashMap;

public class MobileApp implements StockObserver{
    private  final HashMap<String, Boolean> stocks = new HashMap<>();

    public void buyStock(Stock stock){
        stocks.put(stock.getName(), false);
        stock.addObserver(this);
    }
    public void subscribeNotify(String name) throws Exception {
        if (!stocks.containsKey(name)) {
            throw new Exception("У вас нет этой акции!");
        }
        if (stocks.get(name)) {
            throw new Exception("Вы уже подписаны!");
        }
        stocks.put(name, true);
        System.out.println("Вы подписались на уведомления об изменении цены акции " + name);
    }
    public void unsubscribeNotify(String name) throws Exception {
        if (!stocks.containsKey(name)) {
            throw new Exception("У вас нет этой акции!");
        }
        if (!stocks.get(name)) {
            throw new Exception("Вы не подписаны!");
        }
        stocks.put(name, false);
        System.out.println("Вы отписались от уведомлений об изменении цены акции " + name);
    }


    @Override
    public void notifyFall(Stock stock) {
        if (stocks.getOrDefault(stock.getName(), false)) {
            System.out.println("Цена на акции " + stock.getName() + " упала до " + stock.getPrice() + "!");
        }
    }

    // Реакция на рост цены
    @Override
    public void notifyGrowth(Stock stock) {
        if (stocks.getOrDefault(stock.getName(), false)) {
            System.out.println("Цена на акции " + stock.getName() + " выросла до " + stock.getPrice() + "!");
        }
    }
}


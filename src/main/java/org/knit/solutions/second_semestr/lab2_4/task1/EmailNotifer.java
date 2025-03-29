package org.knit.second_semestr.lab2_4.task1;

import java.util.HashMap;

public class EmailNotifer implements StockObserver{

    private String email;
    private HashMap<String, Boolean> subscriptions = new HashMap<>();

    public EmailNotifer(String email) {
        this.email = email;
    }

    public void subscribe(Stock stock) {
        subscriptions.put(stock.getName(), true);
        stock.addObserver(this);
        System.out.println("Email " + email + " подписан на уведомления об акциях " + stock.getName());
    }

    public void unsubscribe(Stock stock) {
        subscriptions.remove(stock.getName());
        stock.removeObserver(this);
        System.out.println("Email " + email + " отписан от уведомлений об акциях " + stock.getName());
    }

    @Override
    public void notifyFall(Stock stock) {
        if (subscriptions.getOrDefault(stock.getName(), false)) {
            System.out.println("Email на " + email + ": Внимание! Цена акции " + stock.getName() + " упала до " + stock.getPrice());
        }
    }

    @Override
    public void notifyGrowth(Stock stock) {
        if (subscriptions.getOrDefault(stock.getName(), false)) {
            System.out.println("Email на " + email + ": Отличные новости! Цена акции " + stock.getName() + " выросла до " + stock.getPrice());
        }
    }

    public String getEmail() {
        return email;
    }
}

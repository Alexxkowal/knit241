package org.knit.second_semestr.lab2_4.task1;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private double price;
    private final String name;
    private final List<StockObserver> observers = new ArrayList<>();

    public Stock(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    // Удаление наблюдателя
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void changePrice(double price){
        double newPrice = price;
        double oldPrice = this.price;
        this.price = newPrice;
        notifyObservers(oldPrice, newPrice);
    }
    private void notifyObservers(double oldPrice, double newPrice) {
        if (newPrice > oldPrice) {
            for (StockObserver observer : observers) {
                observer.notifyGrowth(this);
            }
        } else if (newPrice < oldPrice) {
            for (StockObserver observer : observers) {
                observer.notifyFall(this);
            }
        }
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
}

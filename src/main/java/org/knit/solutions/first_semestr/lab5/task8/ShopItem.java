package org.knit.first_semestr.lab5.task8;

public class ShopItem {
    private final String name;
    private double price;
    private int remainder;

    public ShopItem(String name)
    {
        this.price = 0;
        this.remainder = 0;
        this.name = name;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public void setRemainder(int remainder)
    {
        this.remainder = remainder;
    }
    public double reducePrice (int procent)
    {
        return price - (price/ 100) * procent;
    }
    public void buyItem(int count)
    {
        if (count > remainder)
        {
            System.out.println("Столько нет!!!");
        }
        else {
            remainder -= count;
            System.out.println("Куплено " + count + "шт");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRemainder() {
        return remainder;
    }
    public String toString()
    {
        String s = "price = " + price + '\n' +
                "remainder = " + remainder + '\n' +
                "name = " + name + '\n';
        return s;
    }
    public boolean equals(Object shopItem){
        if (this == shopItem) return true;
        ShopItem shopItem1 = (ShopItem) shopItem;
        return name.equals(shopItem1.getName());
    }
    public int hashCode()
    {
        int result = name == null ? 0: name.hashCode();
        result += price;
        return result;
    }

}

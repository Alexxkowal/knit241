package org.knit.solutions.first_semestr.lab5.task8;

import java.util.Comparator;

public class itemComparator implements Comparator<ShopItem> {
    @Override
    public int compare(ShopItem item1, ShopItem item2) {
        if (item1.getName().compareTo(item2.getName()) == 0)
        {
         return Double.compare(item1.getPrice(), item2.getPrice());
        }
        return item1.getName().compareTo(item2.getName());
    }
}
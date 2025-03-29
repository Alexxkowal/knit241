package org.knit.first_semestr.lab5.task8;

import org.knit.first_semestr.lab5.task9.Task9;

import java.util.*;

public class Task8 {
    public static void execute()
    {
        String[] names = {"книга", "ручка", "линейка", "пенал"};
        Random random = new Random();
        ArrayList <ShopItem> TestData = new ArrayList<>();
        for (int i = 0; i < 100; i++)
        {
            int index = random.nextInt(4);
            ShopItem shopItem = new ShopItem(names[index]);
            int price = random.nextInt(20);
            shopItem.setPrice(price);
            shopItem.setRemainder(20);
            TestData.add(shopItem);
        }
        itemComparator itemComparator = new itemComparator();
        Collections.sort(TestData, itemComparator);
        for (ShopItem shopItem: TestData)
        {
            System.out.println(shopItem.getName() + ' ' + shopItem.getPrice());
        }
        HashMap<ShopItem, Integer> itemCountMap = new HashMap<>();

        for (ShopItem item : TestData) {
            itemCountMap.put(item, itemCountMap.getOrDefault(item, 0) + 1);
        }

        // Выводим количество каждого уникального ShopItem
        for (ShopItem item : itemCountMap.keySet()) {
            System.out.println(item + " - " + itemCountMap.get(item) + " шт.");
        }

    }
}

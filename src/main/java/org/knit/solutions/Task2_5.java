package org.knit.solutions;

import org.knit.solutions.second_semestr.lab2_2.task2_5.Restaurant;

/*
2.5 Задача «Ресторан: Повар и Официант» 🍽️👨‍🍳
📌 Описание:
В ресторане работает один повар и один официант.

Повар готовит блюда и ставит их на поднос (максимум 3 блюда).
Официант берет готовые блюда и подает их клиентам.
🔹 Что нужно реализовать?
✔ Повар не может готовить больше 3 блюд (ждет wait()).
✔ Официант ждет, если поднос пуст (wait()).
✔ При каждой передаче блюда используется notify().
 */
public class Task2_5 {
    public void execute(){
        Restaurant restaurant = new Restaurant();
        Thread threadCooker = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                restaurant.addMeal("Блюдо " + i);
            }
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        Thread threadWaiter = new Thread(() ->{
            for (int i =0; i< 10; i++){
                restaurant.serve();
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

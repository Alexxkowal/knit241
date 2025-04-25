package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.second_semestr.task17.MontyHallGame;

import java.util.Random;

@TaskDescription(taskNumber = 17, taskDescription = "Monty Hall")
public class Task17 implements Solution {
    public  void execute(){
        MontyHallGame montyHallGame = new MontyHallGame();
        Random random = new Random();
        int noSwapCounter = 0;
        System.out.println("Режим без свапа");
        for (int i = 0; i < 1_000_000; i++){
            int target = random.nextInt(3);
            noSwapCounter = montyHallGame.noSwapGame(target, noSwapCounter);
        }
        System.out.println("Режим со свапом");
        int swapCounter = 0;
        for (int i = 0; i < 1_000_000; i++){
            int target = random.nextInt(3);
            swapCounter = montyHallGame.swapGame(target, swapCounter);
        }
        System.out.println("Количество побед в режиме со  свапом = " + swapCounter);
        System.out.println("Количество побед в режиме без свапа = " + noSwapCounter);


    }
}

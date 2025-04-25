package org.knit.solutions.second_semestr.task17;

public class MontyHallGame {
    public int noSwapGame(int target, int counter){
        MontyHallLogic montyHallLogic = new MontyHallLogic();
        montyHallLogic.fillDoors();
        int openDoor = montyHallLogic.firstChoose(target);
        if (montyHallLogic.secondChoose(target)){
            counter++;
        };
        return counter;
    }

    public int swapGame(int target, int counter){
        MontyHallLogic montyHallLogic = new MontyHallLogic();
        montyHallLogic.fillDoors();
        int openDoor = montyHallLogic.firstChoose(target);
        for (int i = 0; i < 3; i++){
            if (i != target && i != openDoor){
                if (montyHallLogic.secondChoose(i)){
                    counter++;
                }
            }
        }
        return counter;
    }
}

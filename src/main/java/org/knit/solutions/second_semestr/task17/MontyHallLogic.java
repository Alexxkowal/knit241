package org.knit.solutions.second_semestr.task17;

import java.util.Random;

public class MontyHallLogic {
    Random random = new Random();
    int firstChooseDoor;

    int[] doors = new int[3];

    public void fillDoors(){
        this.firstChooseDoor = -1;
        int target = random.nextInt(3);

        for (int i = 0; i < doors.length; i++){
            if (i == target){
                doors[i] = 1;
            }
        }
    }

    public int firstChoose(int target){
        for (int i = 0; i < doors.length; i++){
            if (doors[i] == 0 && i!= target){
//                System.out.println("Открыта " + i + " дверь");
                this.firstChooseDoor = i;
                return i;
            }
        }
        return -1;
    }

    public boolean secondChoose(int target) {
        if (target == firstChooseDoor) {
            throw new IllegalArgumentException("Дверь уже открыта!");
        }
        else if (doors[target] == 1){
                System.out.println("Вы победили");
                return true;
        }
        else{
            System.out.println("Вы проиграли");
            return false;

        }
    }
}

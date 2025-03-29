package org.knit.first_semestr.lab9.task16;

public class Task16 {
    public static void execute(){
        for (Rank rank: Rank.values()){
            for (SuitEnum suit: SuitEnum.values()){
                System.out.println(suit.getSuit() + " " + rank.getName());
            }
        }
    }
}

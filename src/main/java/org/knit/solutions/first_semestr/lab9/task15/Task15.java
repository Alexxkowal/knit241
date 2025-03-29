package org.knit.first_semestr.lab9.task15;

public class Task15 {
    public static void execute(){
        for (Seasons seasons: Seasons.values()){
            System.out.println(seasons + " "+ seasons.getHolyday()+ " "+seasons.getWeather());
        }
    }
}

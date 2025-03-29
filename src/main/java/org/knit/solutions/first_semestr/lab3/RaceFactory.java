package org.knit.first_semestr.lab3;

public class RaceFactory {
    public  static Race createrace(String raceName){
        switch (raceName) {
            case "ork":
                return new Race(5, 5, 0, 0);

            case "elf":
                return new Race(0, 5, 0, 100);
            case "human":
                return new Race(5,0,5,0);
            default:
                return new Race(5, 5, 0, 0);
        }
    }
}

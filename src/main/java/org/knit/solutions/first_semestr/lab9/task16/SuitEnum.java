package org.knit.first_semestr.lab9.task16;
enum SuitEnum {
    PEAKS("Пики"),
    HEARTS("Черви"),
    DIAMONDS("Буби"),
    CROSS("Крести");
    private final String suit;
    SuitEnum(String suit){
        this.suit = suit;
    }
    public String getSuit(){return suit;}
}

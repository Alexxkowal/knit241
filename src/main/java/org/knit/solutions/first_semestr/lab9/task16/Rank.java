package org.knit.first_semestr.lab9.task16;

enum Rank {
    TWO("2",2),
    THREE("3",3),
    FOUR("4",4),
    FIVE("5",5),
    SIX("6",6),
    SEVEN("7",7),
    EIGHT("8",8),
    NINE("9",9),
    TEN("10",10),
    JACK("Валет", 11),
    QUEEN("Дама", 12),
    KING("Король", 13),
    ACE("Туз",14);
    private final String name;
    private final int power;
    Rank(String name,int power){
        this.name = name;
        this.power = power;
    }
    public String getName(){return name;}
    public int getPower(){return power;}
}

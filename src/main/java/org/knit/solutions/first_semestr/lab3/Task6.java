package org.knit.first_semestr.lab3;

public class Task6 {
    public static void execute(){
        Mage mage = new Mage("Mage", RaceFactory.createrace("elf"));
        Warrior warrior = new Warrior("Warrior", RaceFactory.createrace("ork"));
        AttackerPriest attackerPriest = new AttackerPriest("AttakerPriest", RaceFactory.createrace("human"));
        System.out.println(warrior);
        mage.attack(warrior);
        System.out.println(warrior);
        warrior.move(50,50);
        warrior.move(1,1);
        System.out.println(mage);
        warrior.attack(mage);
        System.out.println(mage);
        attackerPriest.attack(warrior);
        System.out.println(warrior);
        attackerPriest.heal(warrior);
        System.out.println(warrior);
        mage.spell(warrior);
        System.out.println(warrior);
    }
}

package org.knit.solutions.first_semestr.lab3;

public class Guard extends Warrior {
    public Guard(String name, Race race) {
        super(name, race);
        this.armor = 15;
    }

    @Override
    public void attack(Player player) {
        super.attack(player);
    }

    @Override
    protected void increaseHealth(int healPower) {
        super.increaseHealth(healPower);
    }

    @Override
    protected void decreaseHealth(int damagePower) {
        super.decreaseHealth(damagePower);
    }
}

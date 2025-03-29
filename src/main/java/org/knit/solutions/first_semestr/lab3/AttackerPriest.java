package org.knit.solutions.first_semestr.lab3;

public class AttackerPriest extends  Priest implements Damager{
    public AttackerPriest(String name, Race race) {
        super(name, race);
        this.healpower = 50;
        this.damage = 25;
    }

    @Override
    public void heal(Player player) {
        super.heal(player);
    }

    @Override
    protected void decreaseHealth(int damagePower) {
        super.decreaseHealth(damagePower);
    }

    @Override
    protected void increaseHealth(int healPower) {
        super.increaseHealth(healPower);
    }

    @Override
    public void attack(Player player) {
        player.decreaseHealth(damage);
    }
}

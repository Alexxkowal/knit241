package org.knit.first_semestr.lab3;

public class Priest extends  Player implements Healer{
    int healpower;

    public Priest(String name, Race race) {
        super(name, 150, 150, 0, 0, 0, 5, true, race, 1, 2);
        this.healpower = 20;
    }


    public void heal(Player player){
        player.increaseHealth(healpower + race.getHealBonus());
    }
    @Override
    protected void increaseHealth(int healPower) {
        currentHealth += healPower;
        if (currentHealth >= maxHealth){
            currentHealth = maxHealth;
        }
    }

    @Override
    protected void decreaseHealth(int damagePower) {
        currentHealth = currentHealth + armor + race.getDefenceBonus() - damagePower;
        if (currentHealth <= 0){
            currentHealth = 0;
            isAlive = false;
            System.out.println("Персонаж " + name + " погиб");
        }
    }
    public void move(int x, int y) {
        x_position += x;
        y_position += y;
    }
}

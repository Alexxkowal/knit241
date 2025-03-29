package org.knit.first_semestr.lab3;

public class Mage extends Player implements Damager {
    private final int spellDamage;

    public Mage(String name, Race race) {
        super(name, 150, 150, 0, 0, 10, 2, true, race, 1, 2);
        this.spellDamage = 50;
    }

    public void attack(Player player){
        player.decreaseHealth(damage + race.getAtackBonus());
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
    public void spell(Player player){
        player.decreaseHealth(spellDamage + race.getSpellBonus());
        System.out.println("Применено заклинание");
    }

}

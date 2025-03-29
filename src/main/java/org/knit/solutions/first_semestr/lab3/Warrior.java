package org.knit.first_semestr.lab3;

public class Warrior extends Player implements Damager{
    public Warrior(String name, Race race) {
        super(name, 150, 150, 0, 0, 50, 5, true, race, 2, 2);
    }


    public void attack(Player player){
        int distanceToPlayer = (int) Math.sqrt(Math.pow(x_position - player.getX_position(), 2) + Math.pow(y_position - player.getY_position(), 2));
        if (distanceToPlayer > defaultSkillRange){
            System.out.println("Недостаточно дальности атаки");
        }
        else {
            player.decreaseHealth(damage + race.getAtackBonus());
        }
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
        if (x > maxMoveRange || y > maxMoveRange) {
            System.out.println("Слишком далеко!");
        } else {
            x_position += x;
            y_position += y;
            System.out.println("Текущая позиция "+ x_position + " " + y_position);
        }
    }
}

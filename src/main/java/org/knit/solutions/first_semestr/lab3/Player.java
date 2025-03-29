package org.knit.first_semestr.lab3;

public abstract class Player {
    protected String name;
    protected int currentHealth;
    protected int maxHealth;
    protected int x_position = 0;
    protected int y_position = 0;
    protected int damage;
    protected int armor;
    protected boolean isAlive;
    protected Race race;
    protected int maxMoveRange;
    protected int defaultSkillRange;

    public Player(String name, int currentHealth, int maxHealth, int x_position, int y_position, int damage, int armor, boolean isAlive, Race race, int maxMoveRange, int defaultSkillRange) {
        this.name = name;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.x_position = x_position;
        this.y_position = y_position;
        this.damage = damage;
        this.armor = armor;
        this.isAlive = isAlive;
        this.race = race;
        this.maxMoveRange = maxMoveRange;
        this.defaultSkillRange = defaultSkillRange;
    }

    protected abstract void increaseHealth(int healPower);

    protected abstract void decreaseHealth(int damagePower);

    public abstract void move(int x, int y);

    @Override
    public String toString() {
        return "Player{" +
                "Name='" + name + '\'' +
                ", currentHealth=" + currentHealth +
                ", maxHealth=" + maxHealth +
                ", x_position=" + x_position +
                ", y_position=" + y_position +
                ", damage=" + damage +
                ", armor=" + armor +
                ", isAlive=" + isAlive +
                '}';
    }

    public int getArmor() {
        return armor;
    }

    public int getX_position() {
        return x_position;
    }

    public int getY_position() {
        return y_position;
    }
}

package org.knit.first_semestr.lab3;

public class Race {
    private int defenceBonus;
    private int atackBonus;
    private int healBonus;
    private int spellBonus;

    public Race(int defenceBonus, int atackBonus, int healBonus, int spellBonus) {
        this.defenceBonus = defenceBonus;
        this.atackBonus = atackBonus;
        this.healBonus = healBonus;
        this.spellBonus = spellBonus;
    }

    public int getDefenceBonus() {
        return defenceBonus;
    }

    public int getAtackBonus() {
        return atackBonus;
    }

    public int getHealBonus() {
        return healBonus;
    }

    public int getSpellBonus() {
        return spellBonus;
    }
}

package org.knit.solutions.second_semestr.lab2_5.task16;

public class Character extends Glyph{
    private final char charCode;

    public Character(char charCode) {
        this.charCode = charCode;
    }

    @Override
    public void draw() {
        System.out.println("Нарисована буква " + charCode);
    }
}

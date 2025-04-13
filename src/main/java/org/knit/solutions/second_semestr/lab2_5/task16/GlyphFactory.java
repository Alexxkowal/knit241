package org.knit.solutions.second_semestr.lab2_5.task16;

public class GlyphFactory {
    private final Character[] characterCache = new Character[128];

    public Character createCharacter(char c){
        if (characterCache[c] == null){
            characterCache[c] = new Character(c);
        }
        return characterCache[c];
    }
}

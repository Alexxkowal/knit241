package org.knit.solutions.second_semestr.lab2_5.task16;

public class GlyphContext {

    private int index = 0;
    private int x = 0;
    private int y = 0;

    public void addChar(){
        index++;
        if (x == 10){
            y++;
            x = 0;
        }
    }
}

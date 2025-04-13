package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.second_semestr.lab2_5.task16.Character;
import org.knit.solutions.second_semestr.lab2_5.task16.GlyphContext;
import org.knit.solutions.second_semestr.lab2_5.task16.GlyphFactory;

@TaskDescription(taskNumber = 16, taskDescription = "Паттерн приспособленец")
public class Task16 implements Solution {
    public void execute(){
        GlyphFactory factory = new GlyphFactory();
        GlyphContext glyphContext = new GlyphContext();

        Character a = factory.createCharacter('A');
        Character b = factory.createCharacter('B');
        Character a2 = factory.createCharacter('A');

        System.out.println("a == a2 " + (a == a2));

        a.draw();
        b.draw();
        a2.draw();
    }
}

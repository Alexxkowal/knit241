package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.second_semestr.lab2_3.Race;

@TaskDescription(taskNumber = 10, taskDescription = "Задача «Гонка Cycling Barrier»", href = "org/knit/solutions/taskExampleClasses/README.md")
public class RaceTask implements Solution{
    public void execute(){
        Race race = new Race(5);
        race.execute();
    }
}

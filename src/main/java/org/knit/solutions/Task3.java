package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.second_semestr.lab2_4.task3.*;

@TaskDescription(taskNumber = 13, taskDescription = "Задача «Паттерн Command»", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task3 implements Solution{
    public void execute(){
        Light light = new Light();
        TV tv = new TV();

        RemoteControl remote = new RemoteControl();

        Command lightOn = new LightOnCommand(light);
        Command tvOff = new TVOffCommand(tv);

        remote.setCommand(lightOn);
        remote.pressButton();   // Свет включён

        remote.setCommand(tvOff);
        remote.pressButton();   // Телевизор выключен

        remote.pressUndo();
    }
}

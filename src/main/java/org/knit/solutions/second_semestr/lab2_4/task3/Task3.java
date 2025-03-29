package org.knit.second_semestr.lab2_4.task3;

public class Task3 {
    public static void execute(){
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

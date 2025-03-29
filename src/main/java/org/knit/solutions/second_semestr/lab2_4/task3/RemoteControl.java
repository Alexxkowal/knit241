package org.knit.solutions.second_semestr.lab2_4.task3;

public class RemoteControl {
    private Command currentCommand;
    private Command lastCommand;

    public void setCommand(Command command) {
        this.currentCommand = command;
    }

    public void pressButton() {
        if (currentCommand != null) {
            currentCommand.execute();
            lastCommand = currentCommand;
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            System.out.print("Отмена: ");
            lastCommand.undo();
        }
    }
}
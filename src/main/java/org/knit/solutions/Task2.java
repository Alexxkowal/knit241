package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.second_semestr.lab2_4.task2.TextEditor;

@TaskDescription(taskNumber = 12, taskDescription = "Задача «Паттерн Memento»", href = "org/knit/solutions/taskExampleClasses/README.md")
public class Task2 implements Solution{
    public void execute(){
        TextEditor editor = new TextEditor();

        editor.addText("Привет, ");
        editor.addText("мир!");
        System.out.println(editor.getText());

        editor.undo();
        System.out.println(editor.getText());

        editor.undo();
        System.out.println(editor.getText());

        editor.undo();
    }
}

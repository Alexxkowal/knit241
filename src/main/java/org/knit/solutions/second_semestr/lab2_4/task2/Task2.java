package org.knit.second_semestr.lab2_4.task2;

public class Task2 {
    public static void execute(){
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

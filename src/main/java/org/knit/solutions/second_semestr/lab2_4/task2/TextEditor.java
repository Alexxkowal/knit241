package org.knit.solutions.second_semestr.lab2_4.task2;

public class TextEditor {
    private StringBuilder text = new StringBuilder();
    private final Caretaker caretaker = new Caretaker();


    public StringBuilder getText() {
        return text;
    }

    public void addText(String text){
        caretaker.saveState(save());
        this.text.append(text);
    }

    public Memento save(){
        return new Memento(text.toString());
    }

    public void restore(Memento save) {
    text = new StringBuilder(save.getText());
    }

    public void undo() {
        Memento lastState = caretaker.undo();
        if (lastState != null) {
            restore(lastState);
        } else {
            System.out.println("Нет сохранённых состояний для отката.");
        }
    }
}

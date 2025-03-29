package org.knit.second_semestr.lab2_4.task2;

import java.util.Stack;

public class Caretaker {
    Stack<Memento> history = new Stack<>();

    public void saveState(Memento memento){
        history.push(memento);
    }

    public Memento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null; // нет состояний для отката
    }

    public boolean hasHistory() {
        return !history.isEmpty();
    }

}

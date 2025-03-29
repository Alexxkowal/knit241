package org.knit.solutions.first_semestr.lab2.task5;

import java.util.ArrayList;

public class Folder extends FileSystemComponent{
    ArrayList <FileSystemComponent> components = new ArrayList<>();
    public Folder(String name){
        super(name);
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    protected int getSize() {
        int total = 0;
        for (FileSystemComponent component: components){
            total+= component.getSize();
        }
        return total;
    }
    public void add(FileSystemComponent component){
        components.add(component);
    }
    public void remove(FileSystemComponent component){
        components.remove(component);
    }
    public void display(String indent) {
        System.out.println(indent + "Folder: " + getName() + " (Total Size: " + getSize() + " bytes)");
        for (FileSystemComponent component : components) {
            component.display(indent + "    "); // Выводим элементы с отступом
        }
}
}
package org.knit.first_semestr.lab2.task5;

public abstract class FileSystemComponent {
    String name;
    public FileSystemComponent(String name){
        this.name = name;
    }
    protected abstract String getName();

    protected  abstract int getSize();

    protected abstract void display(String s);
}
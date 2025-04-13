package org.knit.solutions.second_semestr.lab2_5.task14;

public class File implements FileSystemElement{

    String name;
    boolean containVirus = false;
    int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void accept(Visitor v) {
        v.visitFile(this);
    }

    public void switchVirus(){
        this.containVirus = !containVirus;
        System.out.println("Текущее состояние файла " + name + " - " + (containVirus?"заражен" : "не заражен") );
    }
}

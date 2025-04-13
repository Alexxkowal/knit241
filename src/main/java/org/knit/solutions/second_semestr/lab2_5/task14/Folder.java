package org.knit.solutions.second_semestr.lab2_5.task14;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemElement {
    String name;
    public final List<FileSystemElement> elements;

    public Folder(String name) {
        this.name = name;
        elements = new ArrayList<>();
    }

    @Override
    public void accept(Visitor v) {
        v.visitFolder(this);
    }

    public void addElement(FileSystemElement element){
        elements.add(element);
    }


}


package org.knit.solutions.second_semestr.lab2_5.task14;

public interface Visitor {
    void visitFolder(Folder folder);
    void visitFile(File file);
}

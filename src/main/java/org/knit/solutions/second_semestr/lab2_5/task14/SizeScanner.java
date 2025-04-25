package org.knit.solutions.second_semestr.lab2_5.task14;

public class SizeScanner implements Visitor {
    int size = 0;

    @Override
    public void visitFolder(Folder folder) {
        System.out.println("Считаем размер папки " + folder.name);
        for (var i : folder.elements){
            i.accept(this);
        }
        System.out.println("Итоговый размер папки  " + folder.name + " = " + size);
    }

    @Override
    public void visitFile(File file) {
        System.out.println("Размер файла " + file.name + " добавлен");
        size += file.size;
    }
}

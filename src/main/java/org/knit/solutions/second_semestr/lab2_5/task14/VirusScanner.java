package org.knit.solutions.second_semestr.lab2_5.task14;

public class VirusScanner implements Visitor{
    String name;

    public VirusScanner(String name) {
        this.name = name;
    }

    @Override
    public void visitFolder(Folder folder) {
        System.out.println("Проверка папки " + folder.name);
        for (FileSystemElement i: folder.elements){
            i.accept(this);
        }
    }

    @Override
    public void visitFile(File file) {
        System.out.println("Проверка файла " + file.name);
        if (file.containVirus){
            System.out.println("Обнаружен вирус в файле " + file.name);
        }
        else{
            System.out.println("Файл " + file.name + " чист");
        }
    }


}

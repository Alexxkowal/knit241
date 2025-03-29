package org.knit.first_semestr.lab2.task5;

public class Task5 {
    public static void execute(){
        File file = new File("file1", 50);
        Folder folder = new Folder("Folder");
        File file1 = new File("file2", 300);
        Folder folder1 = new Folder("Folder2");
        folder1.add(file1);
        folder.add(file);
        folder.add(folder1);
        folder.display("");
    }
}

package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.second_semestr.lab2_5.task14.File;
import org.knit.solutions.second_semestr.lab2_5.task14.Folder;
import org.knit.solutions.second_semestr.lab2_5.task14.SizeScanner;
import org.knit.solutions.second_semestr.lab2_5.task14.VirusScanner;

@TaskDescription(taskNumber = 14, taskDescription = "Задача на паттерн VISITOR")
public class Task14 implements Solution{
    public  void execute(){
        File file1 = new File("Second", 2);
        File file = new File("First", 1);
        Folder folder = new Folder("Filder1");
        File file2 = new File("Third", 3);
        Folder folder1 = new Folder("Folder2");
        File file3 = new File("Fourth", 4);
        folder.addElement(file1);
        folder.addElement(file2);
        folder.addElement(folder1);
        folder1.addElement(file3);
        folder.addElement(new File("DMAS", 100000));
        file3.switchVirus();

        VirusScanner scanner = new VirusScanner("Virs");
        folder.accept(scanner);
        System.out.println();

        SizeScanner sizeScanner = new SizeScanner();
        folder.accept(sizeScanner);

    }
}

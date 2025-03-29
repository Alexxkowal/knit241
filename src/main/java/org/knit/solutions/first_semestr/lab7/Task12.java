package org.knit.first_semestr.lab7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task12 {
    public void execute() {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Текущая директория: " + currentDir);

        String directoryName = "DirectoryForTask12";
        Path path = Paths.get(directoryName);

        if (!Files.exists(path)) {
            System.out.println("Директория " + directoryName + " не существует!");
            return;
        }

        FileOperationsFabric.Result result = FileOperationsFabric.master(directoryName);
        System.out.println("Количество текстовых файлов: " + result.getFileCount());
        System.out.println("Количество слов: " + result.getWordCount());
    }
}

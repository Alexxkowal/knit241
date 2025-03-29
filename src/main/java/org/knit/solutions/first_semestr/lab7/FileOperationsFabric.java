package org.knit.solutions.first_semestr.lab7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileOperationsFabric {

    public static Result master(String directoryName) {
        Path directoryPath = Paths.get(directoryName);
        TextFileVisitor visitor = new TextFileVisitor();
        try {
            Files.walkFileTree(directoryPath, visitor);  // Обходим директорию
        } catch (IOException e) {
            System.err.println("Ошибка обхода файлов: " + e.getMessage());
        }
        return new Result(visitor.getFileTextCount(), visitor.getWordFileCount());
    }

    // Класс для хранения результатов подсчёта
    public static class Result {
        private final int fileCount;   // Количество текстовых файлов
        private final int wordCount;   // Количество слов в этих файлах

        public Result(int fileCount, int wordCount) {
            this.fileCount = fileCount;
            this.wordCount = wordCount;
        }

        public int getFileCount() {
            return fileCount;
        }

        public int getWordCount() {
            return wordCount;
        }
    }

    private static class TextFileVisitor extends SimpleFileVisitor<Path> {
        private int fileTextCount = 0;  // Счётчик текстовых файлов
        private int wordFileCount = 0;  // Счётчик слов в текстовых файлах

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            if (file.toString().endsWith(".txt")) {
                fileTextCount++;  // Если файл - текстовый, увеличиваем счётчик
                wordFileCount += countWordsInFile(file);  // Подсчитываем слова в файле
            }
            return FileVisitResult.CONTINUE;
        }

        // Метод подсчёта слов в одном файле
        private int countWordsInFile(Path file) {
            int count = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(file.toFile()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    count += line.split("\\s+").length;  // Разделяем строку на слова
                }
            } catch (IOException e) {
                System.err.println("Ошибка чтения файла: " + file + " " + e.getMessage());
            }
            return count;
        }

        public int getFileTextCount() {
            return fileTextCount;
        }

        public int getWordFileCount() {
            return wordFileCount;
        }
    }
}

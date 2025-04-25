package org.knit.solutions;

import org.knit.TaskDescription;
import org.knit.solutions.second_semestr.lab2_5.task15.CachedImageClass;
import org.knit.solutions.second_semestr.lab2_5.task15.Downloader;
import org.knit.solutions.second_semestr.lab2_5.task15.ImageContainer;
import org.knit.solutions.second_semestr.lab2_5.task15.RealImage;

@TaskDescription(taskNumber = 15, taskDescription = "Proxy PATTERN")
public class Task15 implements Solution {
    public void execute() throws InterruptedException {
        ImageContainer realService = new ImageContainer();
        realService.createImages(); // заполнили список изображений

        // Оборачиваем его в прокси с кэшированием
        CachedImageClass cachedService = new CachedImageClass(realService);

        // Downloader будет работать через прокси
        Downloader downloader = new Downloader(cachedService);

        System.out.println("===== Первый вызов listImages() =====");
        downloader.ShowImages(); // будет вызван реальный метод и закэширован результат

        System.out.println("\n===== Второй вызов listImages() (из кэша) =====");
        downloader.ShowImages(); // вызов уже из кэша, без повторной загрузки

        System.out.println("\n===== Первый вызов getImageInfo(3) =====");
        RealImage info1 = cachedService.getImageInfo(3); // загружается и кэшируется
        System.out.println(info1.id);

        System.out.println("\n===== Повторный вызов getImageInfo(3) (из кэша) =====");
        RealImage info2 = cachedService.getImageInfo(3); // из кэша, без загрузки
        System.out.println(info2.id);

        System.out.println("\n===== Скачивание изображения 3 =====");
        downloader.DownloadImage(3); // напрямую вызывает реальную загрузку



    }
}

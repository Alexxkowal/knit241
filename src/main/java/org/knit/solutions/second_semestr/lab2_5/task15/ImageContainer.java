package org.knit.solutions.second_semestr.lab2_5.task15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ImageContainer implements ImageContainerInterface{
    List<RealImage> list = new ArrayList<>();


    public void downLoadImage(int id) throws InterruptedException {
        System.out.println("Загружаю картинку....");
        Thread.sleep(5000);
        System.out.println("Загружено!");

    }


    @Override
    public List<RealImage> listImages() throws InterruptedException {
        System.out.println("Загружаю картинки...");
        Thread.sleep(2000);
        System.out.println("Загружено!");
        return list;
    }

    @Override
    public RealImage getImageInfo(int id) throws InterruptedException {
        System.out.println("Загружаю изображение " + id + " из контейнера");
        Thread.sleep(5000);
        return new RealImage(id);
    }

    public void createImages(){
        for (int i =0; i < 10; i++){
            list.add(new RealImage(i));
        }
    }
}

package org.knit.solutions.second_semestr.lab2_5.task15;

public class Downloader {
    private final ImageContainerInterface api;

    public Downloader(ImageContainerInterface api) {
        this.api = api;
    }

    public void ShowImages() throws InterruptedException {
        for (var i: api.listImages()){
            System.out.println(i.id);
        }
    }

    public void DownloadImage(int id) throws InterruptedException {
        api.downLoadImage(id);
    }

}

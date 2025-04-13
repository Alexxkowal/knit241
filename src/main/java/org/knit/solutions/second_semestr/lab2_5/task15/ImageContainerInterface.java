package org.knit.solutions.second_semestr.lab2_5.task15;

import java.util.List;

public interface ImageContainerInterface {
    List<RealImage> listImages() throws InterruptedException;

    void downLoadImage(int id) throws InterruptedException;

    RealImage getImageInfo(int id) throws InterruptedException;
}

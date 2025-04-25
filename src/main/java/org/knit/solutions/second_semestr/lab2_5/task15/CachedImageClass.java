package org.knit.solutions.second_semestr.lab2_5.task15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachedImageClass implements ImageContainerInterface{
    private final ImageContainerInterface service;
    private List<RealImage> imageListCached;
    private final Map<Integer, RealImage> imageCache = new HashMap<>();


    public CachedImageClass(ImageContainerInterface service) {
        this.service = service;
    }

    @Override
    public List<RealImage> listImages() throws InterruptedException {
        if (imageListCached == null){
            imageListCached = service.listImages();
        }

        return imageListCached;
    }

    @Override
    public void downLoadImage(int id) throws InterruptedException {
        service.downLoadImage(id);
    }

    @Override
    public RealImage getImageInfo(int id) throws InterruptedException {
        if (!imageCache.containsKey(id)){
            imageCache.put(id, service.getImageInfo(id));
        }
        return imageCache.get(id);
    }
}

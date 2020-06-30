package com.service;

import com.model.Image;

public interface ImageService {
    Iterable<Image> findAll();
    Image findById(Long id);
    void save(Image image);
    void remove(Long id);
}

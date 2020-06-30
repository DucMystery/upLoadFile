package com.controller;

import com.model.Image;
import com.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ImageController {
    @Autowired
    Environment env;

    @Autowired
    private ImageService imageService;

    @GetMapping("/image")
    public ModelAndView showList(){
        ModelAndView modelAndView =new ModelAndView("/list");
        Iterable<Image> images = imageService.findAll();
        modelAndView.addObject("images",images);
        return modelAndView;
    }
}

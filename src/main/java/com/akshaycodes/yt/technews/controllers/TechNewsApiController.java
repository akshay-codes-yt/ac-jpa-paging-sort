package com.akshaycodes.yt.technews.controllers;

import com.akshaycodes.yt.technews.dto.TechNewsDto;
import com.akshaycodes.yt.technews.services.TechNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/technews/")
@CrossOrigin
public class TechNewsApiController {
    @Autowired
    private TechNewsService techNewsService;

    @GetMapping
    private TechNewsDto getTechNews() {
        return techNewsService.getTechNews();
    }
}

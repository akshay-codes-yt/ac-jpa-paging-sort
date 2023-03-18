package com.akshaycodes.yt.technews.services;

import com.akshaycodes.yt.technews.dto.TechNewsDto;
import com.akshaycodes.yt.technews.models.TechNews;
import com.akshaycodes.yt.technews.repositories.TechNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechNewsServiceImpl implements TechNewsService {
    @Autowired
    private TechNewsRepository techNewsRepository;

    @Override
    public TechNewsDto getTechNews() {
        List<TechNews> techNewsList = new ArrayList<>();
        techNewsRepository.findAll().forEach(techNewsList::add);

        TechNewsDto techNewsDto = new TechNewsDto();
        techNewsDto.setContent(techNewsList);
        return techNewsDto;
    }
}

package com.akshaycodes.yt.technews.dto;

import com.akshaycodes.yt.technews.models.TechNews;

import java.util.List;

public class TechNewsDto {
    private List<TechNews> content;

    public List<TechNews> getContent() {
        return content;
    }

    public void setContent(List<TechNews> content) {
        this.content = content;
    }
}

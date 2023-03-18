package com.akshaycodes.yt.technews.repositories;

import com.akshaycodes.yt.technews.models.TechNews;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TechNewsRepository extends CrudRepository<TechNews, Integer>, PagingAndSortingRepository<TechNews, Integer> {
}

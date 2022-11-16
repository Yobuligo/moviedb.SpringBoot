package com.yobuligo.moviedb.SpringBoot.movie;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yobuligo.moviedb.SpringBoot.core.IEntityService;

@Service
public class MovieService implements IEntityService<Movie> {
    private ArrayList<Movie> movies = new ArrayList<>();

    @Override
    public Movie add(Movie entity) {
        movies.add(entity);
        return entity;
    }

    @Override
    public Movie delete(Movie entity) {
        movies.remove(entity);
        return entity;
    }

    @Override
    public List<Movie> findAll() {
        return movies;
    }
}

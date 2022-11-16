package com.yobuligo.moviedb.SpringBoot.movie;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yobuligo.moviedb.SpringBoot.core.IdGenerator;

@Service
public class MovieInitializer {
    @Autowired
    private MovieService movieService;

    @Autowired
    private IdGenerator idGenerator;

    @PostConstruct
    public void initialize() {
        movieService.add(new Movie(idGenerator.next(), "Die Verurteilten", 1994, 142, "Drama"));
        movieService.add(new Movie(idGenerator.next(), "Der Pate", 1972, 175, "Drama | Krimi"));
        movieService.add(new Movie(idGenerator.next(), "The Dark Knight", 2008, 152, "Action | Drama | Krimi"));
        movieService.add(new Movie(idGenerator.next(), "Der Pate 2", 1974, 202, "Drama | Krimi"));
    }
}

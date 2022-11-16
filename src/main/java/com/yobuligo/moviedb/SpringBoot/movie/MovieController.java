package com.yobuligo.moviedb.SpringBoot.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieInitializer movieInitializer;

    @GetMapping("/movies")
    public List<Movie> findAll() {
        return movieService.findAll();
    }
}

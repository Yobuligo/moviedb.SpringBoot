package com.yobuligo.moviedb.SpringBoot.movie;

import javax.persistence.Entity;

import com.yobuligo.moviedb.SpringBoot.core.IEntity;

@Entity
public class Movie implements IEntity {
    private Integer id;
    private String title;
    private Integer year;
    private Integer length;
    private String genre;

    public Movie(Integer id, String title, Integer year, Integer length, String genre) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.length = length;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}

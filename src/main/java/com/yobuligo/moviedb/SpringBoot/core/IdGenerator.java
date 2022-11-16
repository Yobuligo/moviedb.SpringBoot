package com.yobuligo.moviedb.SpringBoot.core;

import org.springframework.stereotype.Service;

@Service
public class IdGenerator implements IIdGenerator {
    private Integer cursor = 0;

    @Override
    public Integer next() {
        cursor++;
        return cursor;
    }

}

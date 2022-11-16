package com.yobuligo.moviedb.SpringBoot.core;

import java.util.List;

public interface IEntityService<T extends IEntity> {
    public T add(T entity);

    public T delete(T entity);

    public List<T> findAll();
}

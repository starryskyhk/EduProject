package com.yuxiu.edu.mapper.base;

public interface BaseMapper<T> {

    public T findById(Integer id);
    public T findByUUID(String uuid);

    public void deleteById(Integer id);
    public void deleteByUUId(String uuid);

    public void insert(T t);

    public void save(T t);
}

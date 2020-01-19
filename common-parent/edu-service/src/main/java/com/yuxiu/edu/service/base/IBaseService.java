package com.yuxiu.edu.service.base;

public interface IBaseService<T> {
    public T findById(Integer id);
    public T findByUUID(String uuid);

    public void deleteById(Integer id);
    public void deleteByUUId(String uuid);

    public void insert(T t);

    public void save(T t);
}

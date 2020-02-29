package net.dzioba.asyncrest.domain.services;

import net.dzioba.asyncrest.domain.BaseEntity;

import java.util.List;

public interface CrudService<T extends BaseEntity> {

    List<T> findAll();

    T findById(Long id);

    T save(T object);

    void deleteById(Long id);

    void delete(T object);
}

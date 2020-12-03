package com.danielestupe.dev.api.repositories;

import java.util.List;

import com.danielestupe.dev.api.entities.Pais;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends CrudRepository<Pais, Integer> {
  public List<Pais> findAll();
}

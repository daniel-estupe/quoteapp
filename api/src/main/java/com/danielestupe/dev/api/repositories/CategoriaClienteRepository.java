package com.danielestupe.dev.api.repositories;

import java.util.List;

import com.danielestupe.dev.api.entities.CategoriaCliente;

import org.springframework.data.repository.CrudRepository;

public interface CategoriaClienteRepository extends CrudRepository<CategoriaCliente, Integer> {
  public List<CategoriaCliente> findAll();
}

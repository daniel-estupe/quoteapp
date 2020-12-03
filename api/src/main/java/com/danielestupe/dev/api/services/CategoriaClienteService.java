package com.danielestupe.dev.api.services;

import java.util.List;

import com.danielestupe.dev.api.entities.CategoriaCliente;
import com.danielestupe.dev.api.repositories.CategoriaClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaClienteService {
  @Autowired
  private CategoriaClienteRepository repository;

  public List<CategoriaCliente> findAll() {
    return repository.findAll();
  }

  public float getDiscount(int categoriaId) {
    var categoria = repository.findById(categoriaId).get();
    return categoria.getDescuento();
  }
}

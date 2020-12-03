package com.danielestupe.dev.api.services;

import java.util.List;

import com.danielestupe.dev.api.entities.Pais;
import com.danielestupe.dev.api.repositories.PaisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService {
  @Autowired
  private PaisRepository repository;

  public List<Pais> findAll() {
    return repository.findAll();
  }

  public float getRate(int idPais) {
    var result = repository.findById(idPais).get();
    return result.getRegion().getTarifaGTQ();
  }
}

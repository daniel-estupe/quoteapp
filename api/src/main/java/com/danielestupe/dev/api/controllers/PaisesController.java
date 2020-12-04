package com.danielestupe.dev.api.controllers;

import java.util.List;

import com.danielestupe.dev.api.entities.Pais;
import com.danielestupe.dev.api.repositories.PaisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paises")
@CrossOrigin
public class PaisesController {
  @Autowired
  private PaisRepository repository;

  @GetMapping
  public ResponseEntity<List<Pais>> getAll() {
    try {
      List<Pais> items = repository.findAll();

      if (items.isEmpty())
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

      return new ResponseEntity<>(items, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

}

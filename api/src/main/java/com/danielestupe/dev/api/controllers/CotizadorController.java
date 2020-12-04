package com.danielestupe.dev.api.controllers;

import com.danielestupe.dev.api.models.Cotizador;
import com.danielestupe.dev.api.services.CotizadorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cotizador")
@CrossOrigin
public class CotizadorController {
  @Autowired
  private CotizadorService service;

  @PostMapping
  public ResponseEntity<Float> cotizar(@RequestBody Cotizador item) {
    try {
      float result = service.getQuote(item);
      return new ResponseEntity<>(result, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
    }
  }
}

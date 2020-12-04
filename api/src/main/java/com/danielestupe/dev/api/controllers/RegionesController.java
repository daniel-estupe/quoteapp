package com.danielestupe.dev.api.controllers;

import java.util.List;

import com.danielestupe.dev.api.entities.Region;
import com.danielestupe.dev.api.repositories.RegionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/regiones")
@CrossOrigin
class resourceNameController {

  @Autowired
  RegionRepository repository;

  @GetMapping
  public ResponseEntity<Iterable<Region>> getAll() {
    try {
      List<Region> items = repository.findAll();

      if (items.isEmpty())
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

      return new ResponseEntity<>(items, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  // @GetMapping("{id}")
  // public ResponseEntity<entityClassName> getById(@PathVariable("id")
  // entityIdType id) {
  // Optional<entityClassName> existingItemOptional = repository.findById(id);

  // if (existingItemOptional.isPresent()) {
  // return new ResponseEntity<>(existingItemOptional.get(), HttpStatus.OK);
  // } else {
  // return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  // }
  // }

  // @PostMapping
  // public ResponseEntity<entityClassName> create(@RequestBody entityClassName
  // item) {
  // try {
  // entityClassName savedItem = repository.save(item);
  // return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
  // } catch (Exception e) {
  // return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
  // }
  // }

  // @PutMapping("{id}")
  // public ResponseEntity<entityClassName> update(@PathVariable("id")
  // entityIdType id,
  // @RequestBody entityClassName item) {
  // Optional<entityClassName> existingItemOptional = repository.findById(id);
  // if (existingItemOptional.isPresent()) {
  // entityClassName existingItem = existingItemOptional.get();

  // // existingItem.setSomeField(item.getSomeField());
  // return new ResponseEntity<>(repository.save(existingItem), HttpStatus.OK);
  // } else {
  // return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  // }
  // }

  // @DeleteMapping("{id}")
  // public ResponseEntity<HttpStatus> delete(@PathVariable("id") entityIdType id)
  // {
  // try {
  // repository.deleteById(id);
  // return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  // } catch (Exception e) {
  // return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
  // }
  // }
}

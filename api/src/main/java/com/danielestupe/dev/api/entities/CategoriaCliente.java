package com.danielestupe.dev.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categorias_Cliente")
public class CategoriaCliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String descripcion;
  private float descuento;

  public CategoriaCliente() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public float getDescuento() {
    return descuento;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setDescuento(float descuento) {
    this.descuento = descuento;
  }
}

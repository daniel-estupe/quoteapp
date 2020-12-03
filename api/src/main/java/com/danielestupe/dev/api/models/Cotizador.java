package com.danielestupe.dev.api.models;

public class Cotizador {
  private float peso;
  private Dimension dimension;
  private int paisDestinoId;
  private int categoriaClienteId;

  public Cotizador() {
  }

  public float getPeso() {
    return peso;
  }

  public Dimension getDimension() {
    return dimension;
  }

  public int getPaisDestinoId() {
    return paisDestinoId;
  }

  public int getCategoriaClienteId() {
    return categoriaClienteId;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public void setDimension(Dimension dimension) {
    this.dimension = dimension;
  }

  public void setPaisDestinoId(int paisDestinoId) {
    this.paisDestinoId = paisDestinoId;
  }

  public void setCategoriaClienteId(int categoriaClienteId) {
    this.categoriaClienteId = categoriaClienteId;
  }
}

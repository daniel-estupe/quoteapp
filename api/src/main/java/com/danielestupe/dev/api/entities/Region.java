package com.danielestupe.dev.api.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Regiones")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private float tarifaGTQ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "region")
    private List<Pais> paises;

    public Region() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTarifaGTQ() {
        return tarifaGTQ;
    }

    public void setTarifaGTQ(float tarifaGTQ) {
        this.tarifaGTQ = tarifaGTQ;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
}
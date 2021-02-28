package com.co.sofka.app.Modelo;

public class Escenario {
    private int id;
    private String escNombre;
    private String escCapacidad;
    private Direccion direccion;

    public Escenario(int id, String escNombre, String escCapacidad, Direccion direccion) {
        this.id = id;
        this.escNombre = escNombre;
        this.escCapacidad = escCapacidad;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEscNombre() {
        return escNombre;
    }

    public void setEscNombre(String escNombre) {
        this.escNombre = escNombre;
    }

    public String getEscCapacidad() {
        return escCapacidad;
    }

    public void setEscCapacidad(String escCapacidad) {
        this.escCapacidad = escCapacidad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}

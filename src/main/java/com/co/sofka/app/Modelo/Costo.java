package com.co.sofka.app.Modelo;

public class Costo {

    private int id;
    private float costo;

    public Costo(int id, float costo) {
        this.id = id;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
}

package com.co.sofka.app.Modelo;

public class CostoBoleta {
    private Boleteria boleteria;
    private Costo costo;

    public CostoBoleta(Boleteria boleteria, Costo costo) {
        this.boleteria = boleteria;
        this.costo = costo;
    }

    public Boleteria getBoleteria() {
        return boleteria;
    }

    public void setBoleteria(Boleteria boleteria) {
        this.boleteria = boleteria;
    }

    public Costo getCosto() {
        return costo;
    }

    public void setCosto(Costo costo) {
        this.costo = costo;
    }
}

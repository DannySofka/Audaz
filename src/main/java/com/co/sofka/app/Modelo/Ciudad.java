package com.co.sofka.app.Modelo;

public class Ciudad {
    private int id;
    private String nombreCiudad;
    private Pais pais;

    public Ciudad(int id, String nombreCiudad, Pais pais) {
        this.id = id;
        this.nombreCiudad = nombreCiudad;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}

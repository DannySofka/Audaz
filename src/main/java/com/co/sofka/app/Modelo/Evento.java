package com.co.sofka.app.Modelo;

public class Evento {

    private int id;
    private int costo;
    private String descripcion;
    private Horario horario;

    public Evento(int id, int costo, String descripcion, Horario horario) {
        this.id = id;
        this.costo = costo;
        this.descripcion = descripcion;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}

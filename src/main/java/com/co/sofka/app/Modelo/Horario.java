package com.co.sofka.app.Modelo;

import java.time.LocalTime;

public class Horario {

    private int id;
    private LocalTime hora;

    public Horario(int id, LocalTime hora) {
        this.id = id;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
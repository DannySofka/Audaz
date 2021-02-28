package com.co.sofka.app.Modelo;

import java.util.Date;

public class Pago {
    private int id;
    private Date fecha;
    private Boleteria boleta;
    private String medioPago;

    public Pago(int id, Date fecha, Boleteria boleta, String medioPago) {
        this.id = id;
        this.fecha = fecha;
        this.boleta = boleta;
        this.medioPago = medioPago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boleteria getBoleta() {
        return boleta;
    }

    public void setBoleta(Boleteria boleta) {
        this.boleta = boleta;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
}

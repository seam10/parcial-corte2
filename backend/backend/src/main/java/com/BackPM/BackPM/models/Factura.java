package com.BackPM.BackPM.models;

import jakarta.persistence.*;

@Entity
public class Factura extends ABaseEntity {

    @Column(name = "numeroFactura", nullable = false)
    private String numeroFactura;

    @Column(name = "montoTotal", nullable = false)
    private double montoTotal;

    @Column(name = "pagada", nullable = true)
    private Boolean pagada;

    // Getters and Setters
    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Boolean getPagada() {
        return pagada;
    }

    public void setPagada(Boolean pagada) {
        this.pagada = pagada;
    }
}

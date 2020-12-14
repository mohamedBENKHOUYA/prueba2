package com.example.project4.Models;


import javax.persistence.*;

@Entity
@Table(name = "pago")
public class pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private int id;
    @Column(name= "monto")
    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}

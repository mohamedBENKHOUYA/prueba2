package com.example.project4.Models;

import javax.persistence.*;

@Entity
@Table(name = "compras")
public class compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(name ="monto")
    private double monto;

    @Column(name ="fechaCompras")
    private String fechaCompras;

    @Column(name ="estado")
    private String estado;

    @ManyToOne(targetEntity = Cliente.class)
    private Cliente cliente;

    @ManyToOne(targetEntity = pago.class)
    private pago pago;

}

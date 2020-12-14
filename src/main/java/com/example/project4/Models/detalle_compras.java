package com.example.project4.Models;

import org.hibernate.annotations.LazyToOne;

import javax.persistence.*;

@Entity
@Table(name = "detalle_compras")
public class detalle_compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(targetEntity = Producto.class)
    private Producto producto;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "preciocompra")
    private double preciocompra;

    @OneToOne(targetEntity = compras.class)
    private compras compra;


}

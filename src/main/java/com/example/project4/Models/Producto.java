package com.example.project4.Models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "foto")
    @Lob @Type(type="org.hibernate.type.BlobType")
    private Blob foto;
    @Column(name = "description")
    private String description;
    @Column(name = "precio")
    private double precio;
    @Column(name = "stock")
    private int stock;

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
//    @OneToOne(mappedBy = "producto")
//    private detalle_compras compras;


}

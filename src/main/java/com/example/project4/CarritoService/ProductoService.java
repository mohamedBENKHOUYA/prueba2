package com.example.project4.CarritoService;

import com.example.project4.Beans.ProductoImpl;
import com.example.project4.Models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    @Qualifier("mysql")
    private ProductoImpl productoImpl;


    public List<Producto> getAllProducts()
    {
        return this.productoImpl.findAll();
    }

    public Producto getProductoById(int id)
    {
        return this.productoImpl.findById(id).get();
    }



}

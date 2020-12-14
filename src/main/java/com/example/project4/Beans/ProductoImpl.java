package com.example.project4.Beans;

import com.example.project4.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("mysql")
public interface ProductoImpl extends JpaRepository<Producto, Integer> {
}

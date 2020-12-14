package com.example.project4.Controllers;

import com.example.project4.CarritoService.ProductoService;
import com.example.project4.Models.Carrito;
import com.example.project4.Models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarritoControler {

    List<Carrito> listaCarrito = new ArrayList<Carrito>();
    int item;
    double totalPagar = 0.0;
    int cantidad = 1;

    @Autowired
    private ProductoService productoservice;

//    @GetMapping("/")
//    public String getAllProducts(Model model)
//    {
//
//
//        model.addAttribute("Productos", productoservice.getAllProducts());
//        return "index";
//
//    }

    @GetMapping(value = {"/"})
    public String index(Model model)
    {
        model.addAttribute("contador", listaCarrito.size());
//                model.addAttribute("producto", producto);
        model.addAttribute("Productos", productoservice.getAllProducts());

        return "index";

    }

    @GetMapping(value={"/agregar/{id}"})
    public RedirectView agregar(@PathVariable(value="id") int id,Model model)
    {
        Producto producto = this.productoservice.getProductoById(id);
        item += 1;
        Carrito car = new Carrito();
        car.setItem(item);
        car.setIdProducto(id);
        car.setNombres(producto.getNombres());
        car.setDescription(producto.getDescription());
        car.setPrecioCompra(producto.getPrecio());
        car.setCantidad(this.cantidad);
        car.setSubTotal(cantidad * producto.getPrecio());
        this.listaCarrito.add(car);

        return new RedirectView("/");

    }


    @GetMapping(value={"/carrito"})
    public String carrito(Model model)
    {
        totalPagar = 0.0;
        model.addAttribute("carrito", listaCarrito);
        return "carrito";
    }



}

package com.upc.introduccion.controller;

import com.upc.introduccion.entities.Product;
import com.upc.introduccion.interfaceservice.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductInterface productInterface;
    @PostMapping("/product")
    public Product register(@RequestBody Product product){
        return productInterface.register(product);
    }
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productInterface.getProducts();
    }
}

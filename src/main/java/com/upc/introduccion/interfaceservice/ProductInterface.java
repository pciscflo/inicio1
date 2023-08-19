package com.upc.introduccion.interfaceservice;

import com.upc.introduccion.entities.Product;

import java.util.List;

public interface ProductInterface {
    Product register(Product product);
    List<Product> getProducts();
    Product search(Long id);
    double calcIGV(Product product);
    double calcTotal(Product product);
}

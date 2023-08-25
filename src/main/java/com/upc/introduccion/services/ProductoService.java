package com.upc.introduccion.services;

import com.upc.introduccion.entities.Product;
import com.upc.introduccion.interfaceservice.ProductInterface;
import com.upc.introduccion.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProductoService implements ProductInterface {

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Product register(Product product) {
        return productoRepository.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productoRepository.findAll();
    }

    @Override
    public Product search(Long id) {
        return productoRepository.findById(id).get();
    }
    @Override
    public double searchIGV(Long id){
        Product p = search(id);
        return calcIGV(p);
    }

    @Override
    public double calcIGV(Product product) {
        return product.getPrice()*0.18;
    }

    @Override
    public double calcTotal(Product product) {
        return product.getPrice() + calcIGV(product);
    }
}

package com.upc.introduccion.repositories;

import com.upc.introduccion.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository  extends JpaRepository<Product,Long> {
}

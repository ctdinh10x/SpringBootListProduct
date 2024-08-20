package com.samsung.basicsecurity.repositories;

import com.samsung.basicsecurity.repositories.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Long> {
    
}

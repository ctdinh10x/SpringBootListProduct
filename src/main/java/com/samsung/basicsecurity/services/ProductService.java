package com.samsung.basicsecurity.services;

import com.samsung.basicsecurity.repositories.ProductsRepository;
import com.samsung.basicsecurity.repositories.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService{

    @Autowired
    private ProductsRepository productsRepository;

    public List<Product> findAll(){
        return productsRepository.findAll();
    }
}

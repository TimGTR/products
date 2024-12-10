package org.example.products.service;

import org.example.products.dto.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
    public Flux<Product> getAllProducts() {
        return null;
    }

    public Mono<Product> addProduct(Product product) {
        return null;
    }
}

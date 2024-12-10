package org.example.products.controller;

import lombok.RequiredArgsConstructor;
import org.example.products.dto.Product;
import org.example.products.service.ProductService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public Flux<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Mono<Product> addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
}


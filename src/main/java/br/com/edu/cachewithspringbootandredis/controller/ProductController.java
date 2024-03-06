package br.com.edu.cachewithspringbootandredis.controller;

import br.com.edu.cachewithspringbootandredis.model.Product;
import br.com.edu.cachewithspringbootandredis.service.ProductService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public ResponseEntity<List<Product>> getAll() throws InterruptedException {
        List<Product> products = productService.getAll();
        return ResponseEntity.ok(products);
    }

    @GetMapping("evict")
    @CacheEvict("products")
    public ResponseEntity<String> cacheEvict() {
        return ResponseEntity.ok("OK");
    }
}

package br.com.edu.cachewithspringbootandredis.service;

import br.com.edu.cachewithspringbootandredis.model.Product;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Cacheable("products")
    public List<Product> getAll() throws InterruptedException {
        Thread.sleep(3000);
        List<Product> products = new ArrayList<>();
        return products;
    }

}

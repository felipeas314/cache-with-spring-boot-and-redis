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
        List<Product> products = createProducts();
        return products;
    }

    private List<Product> createProducts() {
        Product celular = Product.builder().code("123abc321").name("Celular motorola").description("Celular super legal da motorola").build();
        Product blusa = Product.builder().code("123abc321").name("Lacoste").description("Blusa super linda do jacarezinho").build();
        return List.of(celular,blusa);
    }

}

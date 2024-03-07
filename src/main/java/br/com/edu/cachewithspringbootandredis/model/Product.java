package br.com.edu.cachewithspringbootandredis.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Product implements Serializable {

    private String code;

    private String name;

    private String description;

    public Product() {}


    public Product(String code,String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

}

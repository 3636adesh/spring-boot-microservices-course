package com.malunjkar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.*;

@ConfigurationPropertiesScan
@RestController
@SpringBootApplication
public class CatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }

    @GetMapping
    public String start() {
        return "<h2>Welcome to Catalog Service!<h2>";
    }
}

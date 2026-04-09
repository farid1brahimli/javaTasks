package az.company.spring_jpa_liquibase_project.controller;

import az.company.spring_jpa_liquibase_project.dao.entity.ProductEntity;
import az.company.spring_jpa_liquibase_project.dao.repository.ProductReposiyory;
import az.company.spring_jpa_liquibase_project.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductEntity entity) {
        productService.createProduct(entity);
    }

    @GetMapping("/{id}")
    public ProductEntity getProductById(@PathVariable Long id){
        return productService.getProductById(id).get();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletepProductById(@PathVariable Long id){
        productService.deleteProductById(id);
    }
}

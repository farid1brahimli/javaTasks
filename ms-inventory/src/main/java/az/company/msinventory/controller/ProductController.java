package az.company.msinventory.controller;

import az.company.msinventory.model.request.CreateProductRequest;
import az.company.msinventory.model.request.ReduceQuantityRequest;
import az.company.msinventory.model.response.ProductResponse;
import az.company.msinventory.service.ProductService;
import lombok.RequiredArgsConstructor;
import static org.springframework.http.HttpStatus.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void createdProduct(@RequestBody CreateProductRequest createProductRequest) {
        productService.crateProduct(createProductRequest);
    }

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public ProductResponse getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping("/reduce")
    @ResponseStatus(OK)
    public ProductResponse reduceProductQuantity(@RequestBody ReduceQuantityRequest reduceQuantityRequest) {
       return productService.reduceProductQuantity(reduceQuantityRequest);
    }
}

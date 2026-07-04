package az.company.msorder.client;

import az.company.msorder.model.client.request.ReduceQuantityRequest;
import az.company.msorder.model.client.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@FeignClient(
        name = "ms-inventory",
        url = "http://localhost:8082",
        path = "/v1/products"
        )
public interface InventoryClient {
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    ProductResponse getProductById(@PathVariable Long id);

    @PostMapping("/reduce")
    @ResponseStatus(HttpStatus.OK)
    void reduceProductQuantity(@RequestBody ReduceQuantityRequest reduceQuantityRequest);

}

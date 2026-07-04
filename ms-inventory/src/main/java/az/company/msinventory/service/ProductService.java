package az.company.msinventory.service;

import az.company.msinventory.dao.entity.ProductEntity;
import az.company.msinventory.dao.repository.ProductRepository;
import az.company.msinventory.exception.ErrorStatus;
import az.company.msinventory.exception.InsuffitcientException;
import az.company.msinventory.exception.NotFoundException;
import az.company.msinventory.mapper.ProductMapper;
import az.company.msinventory.model.request.CreateProductRequest;
import az.company.msinventory.model.request.ReduceQuantityRequest;
import az.company.msinventory.model.response.ProductResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static az.company.msinventory.exception.ErrorStatus.INSUFFICIENT_QUANTITY;
import static az.company.msinventory.exception.ErrorStatus.PRODUCT_NOT_FOUND;
import static az.company.msinventory.mapper.ProductMapper.mapToEntity;
import static az.company.msinventory.mapper.ProductMapper.mapToResponse;
import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void crateProduct(CreateProductRequest createProductRequest) {
        productRepository.save(mapToEntity(createProductRequest));
    }

    public ProductResponse getProductById(Long id) {
        return mapToResponse(productRepository.findById(id).orElseThrow(
                ()-> new NotFoundException(
                        format(PRODUCT_NOT_FOUND.getMessage(), id)
                )
        ));
    }

    public ProductResponse reduceProductQuantity(ReduceQuantityRequest reduceQuantityRequest) {

        var product = productRepository.findById(reduceQuantityRequest.getProductId())
                .orElseThrow(() -> new NotFoundException(
                        format(PRODUCT_NOT_FOUND.getMessage(), reduceQuantityRequest.getProductId())
                ));

        if (product.getQuantity() < reduceQuantityRequest.getQuantity()) {
            throw new InsuffitcientException(
                    format(INSUFFICIENT_QUANTITY.getMessage(), reduceQuantityRequest.getProductId())
            );
        } else {
            product.setQuantity(product.getQuantity() - reduceQuantityRequest.getQuantity());
            productRepository.save(product);
        }
        return mapToResponse(product);
    }
}

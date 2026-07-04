package az.company.msinventory.mapper;

import az.company.msinventory.dao.entity.ProductEntity;
import az.company.msinventory.model.request.CreateProductRequest;
import az.company.msinventory.model.response.ProductResponse;

public class ProductMapper {
    public static ProductEntity mapToEntity(CreateProductRequest productRequest) {
        return ProductEntity.builder()
                .name(productRequest.getProductName())
                .quantity(productRequest.getQuantity())
                .build();
    }

    public static ProductResponse mapToResponse(ProductEntity productEntity) {
        return ProductResponse.builder()
                .id(productEntity.getId())
                .productName(productEntity.getName())
                .quantity(productEntity.getQuantity())
                .build();
    };
}

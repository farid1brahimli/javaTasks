package az.company.msorder.mapper;

import az.company.msorder.dao.entity.OrderEntity;
import az.company.msorder.model.enums.OrderStatus;
import az.company.msorder.model.request.OrderRequest;
import az.company.msorder.model.response.OrderResponse;

import java.time.LocalDateTime;

public class OrderMapper {

    private OrderMapper() {
    }

    public static OrderEntity toEntity(OrderRequest orderRequest) {
        return OrderEntity.builder()
                .productId(orderRequest.getProductId())
                .quantity(orderRequest.getQuantity())
                .status(OrderStatus.PENDING)
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static OrderResponse toResponse(OrderEntity orderEntity) {
        return OrderResponse.builder()
                .id(orderEntity.getId())
                .productId(orderEntity.getProductId())
                .quantity(orderEntity.getQuantity())
                .status(orderEntity.getStatus())
                .createdAt(orderEntity.getCreatedAt())
                .build();
    }
}

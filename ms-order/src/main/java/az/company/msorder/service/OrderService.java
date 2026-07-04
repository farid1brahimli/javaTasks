package az.company.msorder.service;

import az.company.msorder.client.InventoryClient;
import az.company.msorder.dao.repository.OrderRepository;
import az.company.msorder.exception.InsufficientStockException;
import az.company.msorder.exception.OrderNotFoundException;
import az.company.msorder.mapper.OrderMapper;
import az.company.msorder.model.client.request.ReduceQuantityRequest;
import az.company.msorder.model.enums.ErrorStatus;
import az.company.msorder.model.request.OrderRequest;
import az.company.msorder.model.response.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;

    public OrderResponse createOrder(OrderRequest orderRequest) {
        var response = inventoryClient.getProductById(orderRequest.getProductId());
        if (response.getQuantity() < orderRequest.getQuantity()) {
            throw new InsufficientStockException(
                    ErrorStatus.INSUFFICIENT_QUANTITY.name(),
                    String.format(ErrorStatus.INSUFFICIENT_QUANTITY.getMessage(), orderRequest.getProductId())
            );
        }

        inventoryClient.reduceProductQuantity(
                new ReduceQuantityRequest(
                        orderRequest.getProductId(),
                        orderRequest.getQuantity()
                )
        );

        var savedOrder = orderRepository.save(OrderMapper.toEntity(orderRequest));

        return OrderMapper.toResponse(savedOrder);
    }

    public OrderResponse getOrderById(Long orderId) {
        return OrderMapper.toResponse(orderRepository.findById(orderId).orElseThrow(
                ()-> new OrderNotFoundException(
                        ErrorStatus.ORDER_NOT_FOUND.name(),
                        String.format(ErrorStatus.ORDER_NOT_FOUND.getMessage(), orderId)
                )
        ));
    }
}

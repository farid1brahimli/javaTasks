package az.company.msorder.exception.handler;

import az.company.msorder.exception.InsufficientStockException;
import az.company.msorder.exception.OrderNotFoundException;
import az.company.msorder.model.response.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(OrderNotFoundException.class)
    public ErrorResponse handler(OrderNotFoundException exception){
        return ErrorResponse.builder()
                .code(exception.getCode())
                .message(exception.getMessage())
                .timestamp(java.time.LocalDateTime.now())
                .build();
    }

    @ExceptionHandler(InsufficientStockException.class)
    public ErrorResponse handler(InsufficientStockException exception){
        return ErrorResponse.builder()
                .code(exception.getCode())
                .message(exception.getMessage())
                .timestamp(java.time.LocalDateTime.now())
                .build();
    }
}

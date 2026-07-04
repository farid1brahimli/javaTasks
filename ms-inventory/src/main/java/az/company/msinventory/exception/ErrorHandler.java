package az.company.msinventory.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(NotFoundException.class)
    public ErrorResponse handler(NotFoundException exception){
        return ErrorResponse.builder()
                .message(exception.getMessage())
                .build();
    }

    @ExceptionHandler(InsuffitcientException.class)
    public ErrorResponse handler(InsuffitcientException exception){
        return ErrorResponse.builder()
                .message(exception.getMessage())
                .build();
    }
}

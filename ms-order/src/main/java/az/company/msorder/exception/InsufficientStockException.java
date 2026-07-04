package az.company.msorder.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class InsufficientStockException extends RuntimeException {
    private String code;
    public InsufficientStockException(String code, String message) {
        super(message);
        this.code = code;
    }
}

package az.company.msorder.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OrderNotFoundException extends RuntimeException {
    private String code;
    public OrderNotFoundException(String code, String message) {
        super(message);
        this.code = code;
    }
}

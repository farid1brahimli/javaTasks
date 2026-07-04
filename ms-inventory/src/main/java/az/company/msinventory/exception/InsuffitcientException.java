package az.company.msinventory.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InsuffitcientException extends RuntimeException {
    public InsuffitcientException(String message) {
        super(message);
    }
}

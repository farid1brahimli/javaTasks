package az.company.msinventory.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ErrorStatus {
    PRODUCT_NOT_FOUND("Product not found with id: %s"),
    INSUFFICIENT_QUANTITY("Insufficient quantity for product with id: %s");
    private String message;

}

package az.company.msorder.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ErrorStatus {
    ORDER_NOT_FOUND("Order not found with given id: %s"),
    INSUFFICIENT_QUANTITY("Insufficient quantity with given id: %s"),;
    private String message;
}

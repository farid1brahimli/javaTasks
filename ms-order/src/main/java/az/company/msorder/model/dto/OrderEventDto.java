package az.company.msorder.model.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderEventDto implements Serializable {
    private Long orderId;
    private Long productId;
    private Integer quantity;
}

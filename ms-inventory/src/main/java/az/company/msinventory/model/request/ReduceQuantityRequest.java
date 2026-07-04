package az.company.msinventory.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReduceQuantityRequest {
    private Long productId;
    private Integer quantity;
}

package az.company.spring_jdbc_template.model.request;

import az.company.spring_jdbc_template.model.CardStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCardRequest {
    private String holderName;
    private String pan;
    private Integer cvv;
    private YearMonth expiryDate;
    private Double balance;
    private CardStatus status;
}

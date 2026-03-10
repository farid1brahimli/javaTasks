package az.company.spring_jdbc_template.model.response;

import az.company.spring_jdbc_template.model.CardStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardResponse {
    private Long id;
    private String holderName;
    private String pan;
    private Integer cvv;
    private YearMonth expiryDate;
    private Double balance;
    private CardStatus status;
}

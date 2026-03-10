package az.company.spring_jdbc_template.dao.entity;

import az.company.spring_jdbc_template.model.CardStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardEntity {
    private Long id;
    private String holderName;
    private String pan;
    private Integer cvv;
    private YearMonth expiryDate;
    private Double balance;
    private CardStatus status;
}

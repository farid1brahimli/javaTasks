package az.company.spring_jdbc_template.mapper;

import az.company.spring_jdbc_template.dao.entity.CardEntity;
import az.company.spring_jdbc_template.model.CardStatus;
import az.company.spring_jdbc_template.model.request.CreateCardRequest;
import az.company.spring_jdbc_template.model.response.CardResponse;
import org.springframework.jdbc.core.RowMapper;

import java.time.YearMonth;

public class CardMapper {
    public static final RowMapper<CardEntity> MAPPER = (rs, rowNum) ->
            CardEntity.builder()
                    .id(rs.getLong("id"))
                    .holderName(rs.getString("holder_name"))
                    .pan(rs.getString("pan"))
                    .cvv(rs.getInt("cvv"))
                    .expiryDate(YearMonth.from(rs.getDate("expiry_date").toLocalDate()))
                    .balance(rs.getDouble("balance"))
                    .status(CardStatus.valueOf(rs.getString("status")))
                    .build();

    public static CardEntity mapToEntity(CreateCardRequest cardRequest) {
        return CardEntity.builder()
                .holderName(cardRequest.getHolderName())
                .pan(cardRequest.getPan())
                .cvv(cardRequest.getCvv())
                .expiryDate(cardRequest.getExpiryDate())
                .balance(cardRequest.getBalance())
                .status(cardRequest.getStatus())
                .build();
    }

    public static CardResponse mapToDto(CardEntity cardEntity) {
        return CardResponse.builder()
                .id(cardEntity.getId())
                .holderName(cardEntity.getHolderName())
                .pan(cardEntity.getPan())
                .cvv(cardEntity.getCvv())
                .expiryDate(cardEntity.getExpiryDate())
                .balance(cardEntity.getBalance())
                .status(cardEntity.getStatus())
                .build();
    }
}

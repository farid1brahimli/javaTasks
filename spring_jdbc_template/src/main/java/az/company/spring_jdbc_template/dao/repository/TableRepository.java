package az.company.spring_jdbc_template.dao.repository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TableRepository {
    private final JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void createCardsTable() {
        var sql = """
        CREATE TABLE IF NOT EXISTS cards (
        id BIGSERIAL PRIMARY KEY,
        holder_name varchar(255) NOT NULL,
        pan varchar(255) NOT NULL,
        cvv integer NOT NULL,
        expiry_date DATE NOT NULL,
        balance double precision NOT NULL,
        status varchar(20) NOT NULL
        );
        """;

        jdbcTemplate.execute(sql);
    }
}

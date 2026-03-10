package az.company.spring_jdbc_template.dao.repository;

import az.company.spring_jdbc_template.dao.entity.CardEntity;
import az.company.spring_jdbc_template.mapper.CardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CardRepository {
    private final JdbcTemplate jdbcTemplate;

    public void save(CardEntity cardEntity) {
        String sql = "INSERT INTO cards(holder_name, pan, cvv, expiry_date, balance, status) VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(connection -> {
            var ps = connection.prepareStatement(sql);
            ps.setString(1, cardEntity.getHolderName());
            ps.setString(2, cardEntity.getPan());
            ps.setInt(3, cardEntity.getCvv());
            ps.setDate(4, java.sql.Date.valueOf(cardEntity.getExpiryDate().atEndOfMonth()));
            ps.setDouble(5, cardEntity.getBalance());
            ps.setString(6, cardEntity.getStatus().name());
            return ps;
        });
    }

        public List<CardEntity> findAll() {
            String sql = "SELECT * FROM cards";
            return jdbcTemplate.query(sql, CardMapper.MAPPER);
        }

        public Optional<CardEntity> findById(Long id) {
            String sql = "SELECT * FROM cards WHERE id = ?";
            try{
                return Optional.ofNullable(jdbcTemplate.queryForObject(sql, CardMapper.MAPPER, id));
            } catch (Exception exception){
                return Optional.empty();
            }
        }

    public void deleteById(Long id) {
        String sql = "DELETE FROM cards WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}

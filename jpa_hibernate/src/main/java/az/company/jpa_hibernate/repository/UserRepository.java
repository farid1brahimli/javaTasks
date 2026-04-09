package az.company.jpa_hibernate.repository;

import az.company.jpa_hibernate.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

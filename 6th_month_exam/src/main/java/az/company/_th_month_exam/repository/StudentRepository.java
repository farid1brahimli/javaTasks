package az.company._th_month_exam.repository;

import az.company._th_month_exam.entity.StudentEntity;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity,String> {
    List<StudentEntity> findByName(String name);

    @EntityGraph(attributePaths = "courses")
    List<StudentEntity> findAll();
}

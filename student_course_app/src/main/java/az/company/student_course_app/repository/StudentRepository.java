package az.company.student_course_app.repository;

import az.company.student_course_app.entity.StudentEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>, JpaSpecificationExecutor<StudentEntity> {
    List<StudentEntity> findByName(@Param("name") String name);

    @EntityGraph(value = "StudentEntity.withCourses", type = EntityGraph.EntityGraphType.FETCH)
    @Query("SELECT s FROM StudentEntity s")
    List<StudentEntity> findAllWithCourses();
}

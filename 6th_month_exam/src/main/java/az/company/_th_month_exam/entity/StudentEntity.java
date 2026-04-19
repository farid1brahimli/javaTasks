package az.company._th_month_exam.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@NamedQuery(
        name = "StudentEntity.findByName",
        query = "SELECT s FROM StudentEntity s WHERE s.name = name"
)
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    @ManyToMany
    private List<CourseEntity> courses;
}

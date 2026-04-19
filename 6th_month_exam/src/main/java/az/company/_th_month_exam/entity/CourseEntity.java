package az.company._th_month_exam.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany(mappedBy = "courses")
    private List<StudentEntity> students;

}

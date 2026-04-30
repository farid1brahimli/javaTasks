package az.company.student_course_app.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@NamedQuery(
        name = "StudentEntity.findByName",
        query = "SELECT s FROM StudentEntity s WHERE s.name = :name"
)

@NamedEntityGraph(
        name = "StudentEntity.withCourses",
        attributeNodes = @NamedAttributeNode("courses")
)

@Entity
@Getter @Setter
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<CourseEntity> courses = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(id, that.id);  // yalnız id
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);  // yalnız id
    }
}

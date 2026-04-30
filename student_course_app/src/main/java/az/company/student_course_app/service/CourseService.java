package az.company.student_course_app.service;

import az.company.student_course_app.entity.CourseEntity;
import az.company.student_course_app.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    @Transactional(readOnly = true)
    public List<CourseEntity> findAll() {
        return courseRepository.findAll();
    }

    @Transactional(readOnly = true)
    public CourseEntity findById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(id + " id-li kurs tapılmadı, id: "));
    }

    @Transactional
    public CourseEntity save(CourseEntity courseEntity) {
        return courseRepository.save(courseEntity);
    }

    @Transactional
    public void delete(Long id) {
        courseRepository.deleteById(id);
    }
}
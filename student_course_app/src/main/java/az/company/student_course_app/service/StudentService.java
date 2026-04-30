package az.company.student_course_app.service;

import az.company.student_course_app.entity.StudentEntity;
import az.company.student_course_app.repository.StudentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public List<StudentEntity> findByName(String name){
        return studentRepository.findByName(name);
    }

    @Transactional
    public List<StudentEntity> findStudentsOlderThan(int age){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<StudentEntity> cq = cb.createQuery(StudentEntity.class);
        Root<StudentEntity> root = cq.from(StudentEntity.class);

        cq.select(root).where(cb.gt(root.get("age"), age));

        return  em.createQuery(cq).getResultList();
    }

    @Transactional
    public List<StudentEntity> findAllWithCourses(){
        return studentRepository.findAllWithCourses();
    }

    @Transactional
    public List<StudentEntity> findAll(){
        return studentRepository.findAll();
    }

    @Transactional
    public StudentEntity findById(Long id){
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(id + " id-li telebe tapilmadi"));
    }

    @Transactional
    public StudentEntity save(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);
    }

    @Transactional
    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}

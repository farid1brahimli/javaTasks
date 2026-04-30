package az.company.student_course_app.controller;

import az.company.student_course_app.entity.StudentEntity;
import az.company.student_course_app.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentEntity>> getAllStudents(){
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/by-name")
    public ResponseEntity<List<StudentEntity>> getByName(@RequestParam String name) {
        return ResponseEntity.ok(studentService.findByName(name));
    }

    @GetMapping("/older-than")
    public ResponseEntity<List<StudentEntity>> getOlderThan(
            @RequestParam(defaultValue = "20") int age) {
        return ResponseEntity.ok(studentService.findStudentsOlderThan(age));
    }

    @GetMapping("/with-courses")
    public ResponseEntity<List<StudentEntity>> getAllWithCourses() {
        return ResponseEntity.ok(studentService.findAllWithCourses());
    }

    @PostMapping
    public ResponseEntity<StudentEntity> create(@RequestBody StudentEntity studentEntity) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(studentService.save(studentEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }
}


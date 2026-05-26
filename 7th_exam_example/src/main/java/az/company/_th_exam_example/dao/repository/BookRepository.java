package az.company._th_exam_example.dao.repository;

import az.company._th_exam_example.dao.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {
}

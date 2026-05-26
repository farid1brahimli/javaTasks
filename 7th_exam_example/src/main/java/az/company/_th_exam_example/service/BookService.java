package az.company._th_exam_example.service;

import az.company._th_exam_example.dao.repository.BookRepository;
import az.company._th_exam_example.mapper.BookMapper;
import az.company._th_exam_example.model.dto.request.BookRequest;
import az.company._th_exam_example.model.dto.response.BookResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public void createBook(BookRequest bookRequest) {
        var bookEntity = bookMapper.toBookEntity(bookRequest);
        bookRepository.save(bookEntity);
    }

    public List<BookResponse> findAllBooks() {
        return bookRepository.findAll().stream()
                .map(bookMapper::toBookResponse)
                .toList();
    }

    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }
}

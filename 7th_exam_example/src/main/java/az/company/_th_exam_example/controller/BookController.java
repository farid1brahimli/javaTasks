package az.company._th_exam_example.controller;


import az.company._th_exam_example.model.dto.request.BookRequest;
import az.company._th_exam_example.model.dto.response.BookResponse;
import az.company._th_exam_example.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/books")
public class BookController {
    private final BookService bookService;

    @PostMapping
    public ResponseEntity<Void> addBook(@Valid @RequestBody BookRequest bookRequest) {
        bookService.createBook(bookRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<BookResponse>> getAllBooks() {
        return ResponseEntity.ok(bookService.findAllBooks());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Integer id) {
        bookService.delete(id);
        return ResponseEntity.ok().build();

    }
}

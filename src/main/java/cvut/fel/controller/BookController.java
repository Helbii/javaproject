package cvut.fel.controller;

import cvut.fel.dto.BookDTO;
import cvut.fel.dto.DTOMapper;
import cvut.fel.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;
    private final DTOMapper dtoMapper;

    @GetMapping("/book/{id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.bookToBookDTO(bookService.findById(id)));
    }


    @PostMapping("/book")
    public ResponseEntity<BookDTO> getBookById(@RequestBody BookDTO bookDTO) {
        return ResponseEntity.ok(bookService.create(bookDTO));
    }


}

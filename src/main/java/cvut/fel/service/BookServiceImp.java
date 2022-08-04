package cvut.fel.service;

import cvut.fel.dto.BookDTO;
import cvut.fel.dto.DTOMapper;
import cvut.fel.entity.Book;
import cvut.fel.exception.FieldMissingException;
import cvut.fel.exception.NotFoundException;
import cvut.fel.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImp implements BookService {

    private final BookRepository bookRepository;
    private final DTOMapper dtoMapper;


    public Book findById(Long id){

        if (id == null)
            throw new FieldMissingException();
        return bookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("BOOK_NOT_FOUND"));
    }

    @Override
    public BookDTO create(BookDTO bookDTO) {
        if (bookDTO == null)
            throw new FieldMissingException();
        Book book = bookRepository.save(dtoMapper.bookDTOToBook(bookDTO));
        return dtoMapper.bookToBookDTO(book);
    }

    @Override
    public List<Book> findAll() {
        return null;
    }


}

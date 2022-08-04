package cvut.fel.service;

import cvut.fel.dto.BookDTO;
import cvut.fel.entity.Book;

import java.util.List;

public interface BookService {

    Book findById(Long id);
    BookDTO create(BookDTO bookDTO);
    List<Book> findAll();
    //CREATE toute les fonction bbdd

}



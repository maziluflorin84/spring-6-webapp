package florin.springframework.spring6webapp.services;

import florin.springframework.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}

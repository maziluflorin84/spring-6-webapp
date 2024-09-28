package florin.springframework.spring6webapp.services;

import florin.springframework.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}

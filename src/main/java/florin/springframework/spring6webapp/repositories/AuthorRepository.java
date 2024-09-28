package florin.springframework.spring6webapp.repositories;

import florin.springframework.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

package cvut.fel.repository;

import cvut.fel.entity.AuthorsContracts;
import cvut.fel.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsContractsRepository extends CrudRepository<AuthorsContracts, Long> {

}

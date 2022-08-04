package cvut.fel.repository;

import cvut.fel.entity.Book;
import cvut.fel.entity.PublishingHouse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface PublishingHouseRepository extends CrudRepository<PublishingHouse, Long> {
}

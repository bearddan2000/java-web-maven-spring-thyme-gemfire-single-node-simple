package example.repository;

import example.model.Dog;
import org.springframework.stereotype.Repository;
import org.springframework.data.gemfire.repository.query.annotation.Trace;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {
    @Trace
    Dog findByBreed(String breed);
    
    @Trace
    Dog findByColor(String color);
}
package Traffic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Traffic.entites.Causes;

@Repository
public interface causesRepository extends CrudRepository<Causes, Long>{

}

package Traffic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Traffic.entites.Routes;

@Repository
public interface routesRepository extends CrudRepository<Routes, Long>{

}

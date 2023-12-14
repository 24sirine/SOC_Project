package Traffic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Traffic.entites.Mois;

@Repository
public interface moisRepository extends CrudRepository<Mois, Long>{

}

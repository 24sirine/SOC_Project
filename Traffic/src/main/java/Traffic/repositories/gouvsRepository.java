package Traffic.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Traffic.entites.Gouvs;

@Repository
public interface gouvsRepository extends CrudRepository<Gouvs, Long>{
	//chercher le gouvernorat avec son nom
		@Query(value="SELECT * FROM T_gouvs g WHERE g.GOUV=?1 ",nativeQuery=true)
		Gouvs findByGouvNom(String gouv);
}

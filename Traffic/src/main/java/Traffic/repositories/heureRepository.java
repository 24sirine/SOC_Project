package Traffic.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Traffic.entites.Heures;

@Repository
public interface heureRepository extends CrudRepository<Heures, Long>{
	//chercher le nb d'accident en donnant l'heure
	@Query(value="SELECT H_ACCIDENTS FROM T_heures h WHERE h.HEURE=?1 ",nativeQuery=true)
	String findAccidentByHeure(String heure);
	//chercher le nb de blesses en donnant l'heure
		@Query(value="SELECT H_BLESSES FROM T_heures h WHERE h.HEURE=?1 ",nativeQuery=true)
		String findBlessesByHeure(String heure);
		//chercher le nb de tues en donnant l'heure
		@Query(value="SELECT H_TUES FROM T_heures h WHERE h.HEURE=?1 ",nativeQuery=true)
		String findTuesByHeure(String heure);
}

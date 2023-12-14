package Traffic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Traffic.entites.Heures;
import Traffic.repositories.heureRepository;

@Service
public class HeuresService implements IHeuresService{
@Autowired
heureRepository heurerepo;
	@Override
	public List<Heures> afficherListeHeures() {
		return (List<Heures>) heurerepo.findAll();		
	}
	@Override
	public String findAccidentByHeure(String heure) {
		
		return heurerepo.findAccidentByHeure(heure);
	}
	@Override
	public String findBlessesByHeure(String heure) {
		return heurerepo.findBlessesByHeure(heure);
	}
	@Override
	public String findTuesByHeure(String heure) {

		return heurerepo.findTuesByHeure(heure);
	}

}

package Traffic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Traffic.entites.Gouvs;
import Traffic.repositories.gouvsRepository;


@Service
public class GouvsService implements IGouvsService{

	
	@Autowired
	gouvsRepository gouvrepo;
		@Override
		public List<Gouvs> afficherListeGouvs() {
			return (List<Gouvs>) gouvrepo.findAll();		
		}
		@Override
		public Gouvs findGouvsByName(String name) {
			
			return gouvrepo.findByGouvNom(name);
		}

}

package Traffic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Traffic.entites.Mois;
import Traffic.repositories.moisRepository;


@Service
public class MoisService implements IMoisService{
	@Autowired
	moisRepository moisrepo;
		@Override
		public List<Mois> afficherListMois() {
			return (List<Mois>) moisrepo.findAll();		
		}
}

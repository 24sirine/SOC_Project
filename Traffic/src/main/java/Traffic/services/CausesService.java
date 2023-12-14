package Traffic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Traffic.entites.Causes;
import Traffic.repositories.causesRepository;


@Service
public class CausesService implements ICausesService{

	@Autowired
	causesRepository causerepo;
		@Override
		public List<Causes> afficherListeCauses() {
			return (List<Causes>) causerepo.findAll();		
		}
	

}

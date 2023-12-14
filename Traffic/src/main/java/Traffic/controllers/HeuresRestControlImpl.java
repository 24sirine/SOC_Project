package Traffic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Traffic.entites.Heures;
import Traffic.services.IHeuresService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HeuresRestControlImpl {
	@Autowired
	IHeuresService heureservice;



	//http://localhost:8083/SpringMVC/servlet/afficher-tous-Heures
	@GetMapping("/afficher-tous-Heures")
	public List<Heures> afficherTousHeures() {
	List<Heures> list = heureservice.afficherListeHeures();
	return list;
	} 
	
	//http://localhost:8083/SpringMVC/servlet/afficherAccidentDataByHeure/{heure}
			@GetMapping("/afficherAccidentDataByHeure/{heure}")
			public String afficherAccidentDataByHeure(@PathVariable("heure") String heure)
			{ return heureservice.findAccidentByHeure(heure)	;
			}
	
			//http://localhost:8083/SpringMVC/servlet/afficherTuesDataByHeure/{heure}
			@GetMapping("/afficherTuesDataByHeure/{heure}")
			public String afficherTuesDataByHeure(@PathVariable("heure") String heure)
			{ return heureservice.findTuesByHeure(heure)	;
			}
			
			//http://localhost:8083/SpringMVC/servlet/afficherBlessesDataByHeure/{heure}
			@GetMapping("/afficherBlessesDataByHeure/{heure}")
			public String afficherBlessesDataByHeure(@PathVariable("heure") String heure)
			{ return heureservice.findBlessesByHeure(heure)	;
			}
}

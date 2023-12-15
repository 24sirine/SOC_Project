package Traffic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Traffic.entites.Mois;
import Traffic.services.IMoisService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MoisRestControlImpl {
	@Autowired
	IMoisService moisservice;



	//http://localhost:8083/SpringMVC/servlet/afficher-tous-Mois
	@GetMapping("/afficher-tous-Mois")
	public List<Mois> afficherTousMois() {
	List<Mois> list = moisservice.afficherListMois();
	return list;
	} 
}

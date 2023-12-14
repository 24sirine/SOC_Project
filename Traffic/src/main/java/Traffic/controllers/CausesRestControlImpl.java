package Traffic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Traffic.entites.Causes;
import Traffic.services.ICausesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CausesRestControlImpl {
	@Autowired
	ICausesService causeService;
	//http://localhost:8083/SpringMVC/servlet/afficher-tous-Causes
		@GetMapping("/afficher-tous-Causes")
		public List<Causes> afficherTousCauses() {
		List<Causes> list = causeService.afficherListeCauses();
		return list;
		} 
}

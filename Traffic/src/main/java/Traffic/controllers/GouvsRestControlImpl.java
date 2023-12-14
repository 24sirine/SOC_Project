package Traffic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import Traffic.entites.Gouvs;
import Traffic.services.IGouvsService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class GouvsRestControlImpl {
	@Autowired
	IGouvsService gouvservice;
	//http://localhost:8083/SpringMVC/servlet/afficher-tous-Gouvs
		@GetMapping("/afficher-tous-Gouvs")
		public List<Gouvs> afficherTousGouvs() {
		List<Gouvs> list = gouvservice.afficherListeGouvs();
		return list;
		} 
	
		
		//http://localhost:8083/SpringMVC/servlet/afficherDataByGouvName/{name}
		@GetMapping("/afficherDataByGouvName/{name}")
		public Gouvs afficherDataByGouvName(@PathVariable("name") String name)
		{ return gouvservice.findGouvsByName(name)	;
		}
}

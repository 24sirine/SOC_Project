package Traffic.services;

import java.util.List;


import Traffic.entites.Heures;

public interface IHeuresService {
	//pour afficher la liste des heures
			public List<Heures> afficherListeHeures();
	//pour afficher le nb d'accidents dans cette heure		
			public String findAccidentByHeure(String heure);				
			//pour afficher le nb de blesses en donnant l'heure	
			public String findBlessesByHeure(String heure);
			//Pour afficher le nb de tues en donnant l'heure
			public String findTuesByHeure(String heure);
}

package Traffic.services;

import java.util.List;

import Traffic.entites.Gouvs;

public interface IGouvsService {
	//pour afficher la liste des gouvs
			public List<Gouvs> afficherListeGouvs();
	//pour afficher les données selon le nom du gouv
			public Gouvs findGouvsByName(String name);
}

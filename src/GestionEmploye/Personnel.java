package GestionEmploye;

import java.util.ArrayList;

public class Personnel {
	private ArrayList<Employe> employes = new ArrayList<>();
	void ajouterEmploye(Employe employe) {
		employes.add(employe);
	}
	void afficherSalaires() {
		for(Employe employe:employes) {
			System.out.println(employe.getNom());
		}
	}
	public double salaireMoyen() {
		double somme=0;
		int nbr=0;
		for(Employe employe:employes) {
			somme=somme+employe.calculerSalaire();
			nbr=nbr+1;
		}
		return somme/nbr;
	}
}

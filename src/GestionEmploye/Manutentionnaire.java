package GestionEmploye;

class Manutentionnaire extends Employe{
	private final static double tauxHoraire=65;
	private double nbreHeures;
	public Manutentionnaire(String nom,String prenom,int age,String DateEntree,int nbreHeures) {
		super(nom,prenom,age,DateEntree);
		this.nbreHeures=nbreHeures;
	}
	
	public double getTauxHoraire() {
		return tauxHoraire;
	}
	@Override
	public double calculerSalaire() {
		return nbreHeures*tauxHoraire;
	}
	public String getTitreEmploye() {
		return "Le manut.";
	}
}

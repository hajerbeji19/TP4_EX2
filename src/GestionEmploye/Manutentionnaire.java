package GestionEmploye;

class Manutentionnaire extends Employe{
	private double nbreHeures;
	public Manutentionnaire(String nom,String prenom,int age,String DateEntree,int nbreHeures) {
		super(nom,prenom,age,DateEntree);
		this.nbreHeures=nbreHeures;
	}
	@Override
	public double calculerSalaire() {
		return nbreHeures*65;
	}
	public String getTitreEmploye() {
		return "Le manut.";
	}
}

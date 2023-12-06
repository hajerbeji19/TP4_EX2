package GestionEmploye;

class ManutARisque extends Employe{
	private double nbreHeures;
	public ManutARisque(String nom,String prenom,int age,String DateEntree,int nbreHeures) {
		super(nom,prenom,age,DateEntree);
		this.nbreHeures=nbreHeures;
	}
	@Override
	public double calculerSalaire() {
		return nbreHeures*65+200;
	}
	public String getTitreEmploye() {
		return "Le Manut.";
	}
}
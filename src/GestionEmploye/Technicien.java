package GestionEmploye;

class Technicien extends Employe{
	private int nbreUniteProduites;
	public Technicien(String nom,String prenom,int age,String DateEntree,int nbreUniteProduites) {
		super(nom,prenom,age,DateEntree);
		this.nbreUniteProduites=nbreUniteProduites;
	}
	@Override
	public double calculerSalaire() {
		return nbreUniteProduites*5;
	}
	public String getTitreEmploye() {
		return "Le technicien";
	}
}

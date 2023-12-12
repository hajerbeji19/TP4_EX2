package GestionEmploye;

class Technicien extends Employe{
	private int nbreUniteProduites;
	private static final double ValAMultiplier=5.0;
	public Technicien(String nom,String prenom,int age,String DateEntree,int nbreUniteProduites) {
		super(nom,prenom,age,DateEntree);
		this.nbreUniteProduites=nbreUniteProduites;
	}
	@Override
	public double calculerSalaire() {
		return nbreUniteProduites*ValAMultiplier;
	}
	public String getTitreEmploye() {
		return "Le technicien";
	}
}

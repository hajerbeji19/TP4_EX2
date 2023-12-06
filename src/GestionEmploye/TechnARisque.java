package GestionEmploye;

class TechnARisque extends Employe{
	private int nbreUniteProduites;
	public TechnARisque(String nom,String prenom,int age,String DateEntree,int nbreUniteProduites) {
		super(nom,prenom,age,DateEntree);
		this.nbreUniteProduites=nbreUniteProduites;
	}
	@Override
	public double calculerSalaire() {
		return nbreUniteProduites*5+200;
	}
	public String getTitreEmploye() {
		return "Le technicien";
	}
}

package GestionEmploye;

class TechnARisque extends Technicien implements EmployeRisque{
	public TechnARisque(String nom,String prenom,int age,String DateEntree,int nbreUniteProduites) {
		super(nom,prenom,age,DateEntree,nbreUniteProduites);
	}
	@Override
	public double calculerSalaire() {
		return super.calculerSalaire()+prime;
	}
}

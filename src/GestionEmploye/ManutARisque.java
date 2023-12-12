package GestionEmploye;

class ManutARisque extends Manutentionnaire implements EmployeRisque{
	public ManutARisque(String nom,String prenom,int age,String DateEntree,int nbreHeures) {
		super(nom,prenom,age,DateEntree,nbreHeures);
	}
	@Override
	public double calculerSalaire() {
		return super.calculerSalaire()+prime;
	}
}
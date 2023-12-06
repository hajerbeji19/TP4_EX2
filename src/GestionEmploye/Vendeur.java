package GestionEmploye;

class Vendeur extends Commerciale{
	public Vendeur(String nom,String prenom,int age,String DateEntree,double ChiffreAffaire) {
		super(nom,prenom,age,DateEntree,ChiffreAffaire);
	}
	@Override
	public double calculerSalaire() {
		return getChiffreAffaire()*0.2+400;
	}
	public String getTitreEmploye() {
		return "Le vendeur";
	}
	
}

package GestionEmploye;

class Representant extends Commerciale{
	public Representant(String nom,String prenom,int age,String DateEntree,double ChiffreAffaire) {
		super(nom,prenom,age,DateEntree,ChiffreAffaire);
	}
	@Override
	public double calculerSalaire() {
		return getChiffreAffaire()*0.2+800;
	}
	public String getTitreEmploye() {
		return "Le representant";
	}
}

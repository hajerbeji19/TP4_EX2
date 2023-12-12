package GestionEmploye;

class Vendeur extends Commerciale{
	public static final double pourcent=0.2;
	public static final double Bonus=400.0;
	public Vendeur(String nom,String prenom,int age,String DateEntree,double ChiffreAffaire) {
		super(nom,prenom,age,DateEntree,ChiffreAffaire);
	}
	@Override
	public double calculerSalaire() {
		return getChiffreAffaire()*pourcent+Bonus;
	}
	public String getTitreEmploye() {
		return "Le vendeur";
	}
	
}

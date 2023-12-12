package GestionEmploye;

class Representant extends Commerciale{
	public static final double pourcent=0.2;
	public static final double Bonus=800.0;
	public Representant(String nom,String prenom,int age,String DateEntree,double ChiffreAffaire) {
		super(nom,prenom,age,DateEntree,ChiffreAffaire);
	}
	@Override
	public double calculerSalaire() {
		return getChiffreAffaire()*pourcent+Bonus;
	}
	public String getTitreEmploye() {
		return "Le representant";
	}
}

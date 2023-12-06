package GestionEmploye;

public abstract class Commerciale extends Employe{
	private double ChiffreAffaire;
	public Commerciale(String nom,String prenom,int age,String DateEntree,double ChiffreAffaire) {
		super(nom,prenom,age,DateEntree);
		this.ChiffreAffaire=ChiffreAffaire;
	}
	public double getChiffreAffaire() {
		return ChiffreAffaire;
	}
}

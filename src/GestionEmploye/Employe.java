package GestionEmploye;

abstract class Employe {
	private String nom;
	private String prenom;
	private int age;
	private String DateEntree;
	public Employe(String nom,String prenom,int age,String DateEntree) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.DateEntree=DateEntree;
	}
	abstract double calculerSalaire();
	public String getTitreEmploye() {
		return "L' employé";
	}
	public String getNom(){
		return getTitreEmploye()+" "+nom+" "+prenom+" gagne "+calculerSalaire()+" dinars.";
	}
	
}

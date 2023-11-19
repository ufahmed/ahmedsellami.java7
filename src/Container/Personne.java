package Container;

public class Personne {
	private int cin;
	private String nom;
	private String prenom;
	
	
	public Personne(int c,String nom,String prenom) {
		this.cin=c;
		this.nom=nom;
		this.prenom=prenom;
		
	}
	
	public int getcin() {
		return this.cin;
		
	}
	public void setcin(int cin) {
		this.cin=cin;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String toString() {
		return("cin:"+this.cin+"nom:"+this.nom+"prenom"+this.prenom);
	}
	
	
	

}

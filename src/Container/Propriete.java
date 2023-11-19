package Container;

public class Propriete {
	private int id;
	private Personne responsable;
	private String  adresse;
	private double surface;
	
	
	public Propriete(int id,Personne p1,String adresse,double s) {
		this.id=id;
		this.responsable=p1;
		this.adresse=adresse;
		this.surface=s;
		
	}
	
	public String toString() {
		return ("id:"+this.id+"responsable:"+this.responsable+"adresse"+this.adresse+
				"surface"+this.surface);
	}
	
	public double calcullmpot() {
		return 0;
	}
	
	public String get_adresse() {
		return adresse;
	}

}

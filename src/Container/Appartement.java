package Container;

public class Appartement extends ProprietePrivee {
	private int numEtage;
	
    public Appartement(int id,Personne responsable,String adresse,double surface,int nbP,int numEtage) {
    	super(id,responsable,adresse,surface,nbP);
    	this.numEtage=numEtage;
    }
}

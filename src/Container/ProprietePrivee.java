package Container;

public class ProprietePrivee extends Propriete {
	private int nbPieces;
	
    public ProprietePrivee(int id,Personne p1,String adresse,double surface,int nb) {
    	super(id,p1,adresse,surface);
    	this.nbPieces=nb;
    }
    
    @Override
    public String toString() {
    	return super.toString()+"nombre de pieces"+this.nbPieces;
    }
    
    @Override
    public double calcullmpot() {
    	return (50/100+10/nbPieces);
    }

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
    
}

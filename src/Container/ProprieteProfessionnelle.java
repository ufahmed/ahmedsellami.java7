package Container;

public class ProprieteProfessionnelle extends Propriete {
	private int nbEmployes;
	private boolean estEtatique;
	
	public ProprieteProfessionnelle(int id,Personne responsable,String adresse,double surface,int nbE,boolean etat ) {
    	super(id,responsable,adresse,surface);
    	this.nbEmployes=nbE;
    	this.estEtatique=etat;
	}
	
	@Override
    public String toString() {
    	return super.toString()+"nombre de Employes"+this.nbEmployes+"estEtatique"+this.estEtatique;
    }
	
	@Override
	public double calcullmpot() {
		if(estEtatique==false) {
			return(100/100+30/nbEmployes);
		}
		else {
			return 0;
		}
		
	}
	
	
	
    
}

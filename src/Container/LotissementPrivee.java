package Container;

public class LotissementPrivee extends Lotissement {
	public LotissementPrivee(int capacité){
		super(capacité);
		
		
	}
	
	public boolean ajouter(Propriete p) {
		if(p instanceof ProprietePrivee) {
			return super.ajouter(p);
		}
		return false;
		
		
	}
	
	

}

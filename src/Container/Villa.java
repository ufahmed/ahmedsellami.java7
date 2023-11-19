package Container;

public class Villa extends ProprietePrivee {
	private boolean avecPiscine;
	
	public Villa(int id,Personne responsable,String adresse,double surface,int nbP,boolean avecpiscine) {
		super(id,responsable, adresse, surface, nbP);
		this.avecPiscine=avecpiscine;
		
	}
	
	@Override
	public double calcullmpot() {
		double nb=calcullmpot();
		if(avecPiscine==true) {
			nb=nb+200;
			
		}
		return nb;
		
		
	}
	
	
	
}

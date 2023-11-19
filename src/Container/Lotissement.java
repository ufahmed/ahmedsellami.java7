package Container;

public class Lotissement implements GestionPropriete{
	protected Propriete [] tabProp;
	protected int nombre;
	@Override
	public void afficherPropriétés(){
		for(int i=0;i<tabProp.length;i++) {
			System.out.println(tabProp[i].toString());
		}
		
	}
	
	@Override
	public boolean ajouter(Propriete p) {
		if(nombre<tabProp.length) {
			tabProp[nombre]=p;
			nombre++;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean supprimer(Propriete p) {
		for(int i=0;i<nombre;i++) {
			if(tabProp[i].equals(p)){
				for(int j=i;j<nombre;j++)
				{
					tabProp[j]=tabProp[j+1];
			    }
			    nombre--;
			    return true;
			}	
		}
		return false;
				
	}
	Lotissement(int capacité){
		if(capacité>MAX_PROPRIETES) {
			return ;
		}
		else {
			tabProp=new Propriete[capacité];
		}
	}
	
	Propriete getpropriétéByIndice (int i) {
		if(i>0 && i<nombre)
		{
			return tabProp[i];
		}
		return null;    		
	}
	public int getnbPièces() {
		int n=0;
		for(int i=0;i<nombre;i++) {
			if (tabProp[i] instanceof ProprietePrivee){
				n=n+((ProprietePrivee) tabProp[i]).getNbPieces();
			}
			
		}
		return n;
	}
	

}

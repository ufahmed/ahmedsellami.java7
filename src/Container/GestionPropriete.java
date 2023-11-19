package Container;

public interface GestionPropriete {
	public static final	int  MAX_PROPRIETES=100;
	
	public void afficherPropriétés();
	public boolean ajouter(Propriete p);
	public boolean supprimer(Propriete p);
	
	

}

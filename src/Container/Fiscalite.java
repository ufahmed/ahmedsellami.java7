package Container;

public class Fiscalite {
	public static void main(String[] args) {
		Personne p1 =new Personne(123,"iyed","zaedezd");
		Personne p2 =new Personne(345,"ahmed","zFA");
		Personne p3 =new Personne(789,"yassine","fdzd");
		
		Lotissement l=new Lotissement(10);
		
		ProprietePrivee k1=new ProprietePrivee(1,p1,"Corniche",350,4);
		Villa v=new Villa(2,p2,"Dar Chaabane", 400,6,true);
		Appartement a=new Appartement(3,p2,"Hammamet",1200,8, 3);
		ProprieteProfessionnelle k2=new ProprieteProfessionnelle(4,p3,"Korba", 1000, 50,true);
		ProprieteProfessionnelle k3=new ProprieteProfessionnelle(5,p1,"Bir Bouragba",2500, 400, false);
		
		l.ajouter(k1);
		l.ajouter(v);
		l.ajouter(a);
		l.ajouter(k2);
		l.ajouter(k3);
		
		System.out.println("nb global pieces"+l.getnbPièces());
		
		double min=l.tabProp[0].calcullmpot();
		for(int i=0;i<l.tabProp.length;i++) {
			if(l.tabProp[i] instanceof ProprietePrivee) {
				double x=l.tabProp[i].calcullmpot();
				if(x<min) {
					min=x;
					
				}
			}
		}
		
		for(int i=0;i<l.tabProp.length;i++) {
			if(l.tabProp[i] instanceof Appartement){
				if(l.tabProp[i].get_adresse().equals("Hammamet")) {
					l.supprimer(l.tabProp[i]);
						
					break;
					
				}
			}
		}
		
		Lotissement lt= new LotissementPrivee(10);
		lt.ajouter(k1);
		lt.ajouter(v);
		lt.ajouter(a);
		lt.ajouter(k2);
		lt.ajouter(k3);

		
		
	}
}

/*
 *  Generaliste.java
 *  yves Mercadier
 * 
 */


public class Generaliste extends Etudiant{
	//constructeur:
	//Entrée: deux chaines de caractére représentant le nom et le prénom de l'étudiant.
	//cinq doubles compris entre 0 et 20, représentant les notes dans les cinq matiéres.
	//un tableau de booléen représentant les dispenses.
	Generaliste(String n,String pr,double m, double l,double p,double i,double e,boolean[]d){
		super(n,pr,m,l,p,i,e,d);		
		}
	public String pourAffichageGeneraliste(){
		String s=super.pourAffichageGeneraliste();
		if(super.validationGeneraliste()){s=s+"\nReçu.";}
		else{s=s+"\nAjourné.";}
		return   s;
		}

}

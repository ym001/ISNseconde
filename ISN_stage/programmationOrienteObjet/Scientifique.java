/*
 *  Scientifique.java
 *  yves Mercadier
 * 
 */


public class Scientifique extends Etudiant{
	//constructeur:
	//Entrée: deux chaines de caractére représentant le nom et le prénom de l'étudiant.
	//cinq doubles compris entre 0 et 20, représentant les notes dans les cinq matiéres.
	Scientifique(String n,String pr,double m, double l,double p,double i,double e){
		super(n,pr,m,l,p,i,e);		
		}
	public String pourAffichage(){
		String s=super.pourAffichage();
		if(this.validation()){s=s+"\nReçu.";}
		else{s=s+"\nAjourné.";}
		return   s;
		}
	public boolean validation(){
		boolean b;
		if(!super.validation()){return false;}
		if(super.scientifique()){b=true;}else{b=false;}
		return b;
		}
}

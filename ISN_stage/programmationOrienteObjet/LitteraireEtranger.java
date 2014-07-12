/*
 *  LitteraireEtranger.java
 *  yves Mercadier
 * 
 */


public class LitteraireEtranger extends Etudiant{
	private double bonus;
	//constructeur:
	//Entrée: deux chaines de caractére représentant le nom et le prénom de l'étudiant.
	//cinq doubles compris entre 0 et 20, représentant les notes dans les cinq matiéres.
	LitteraireEtranger(String n,String pr,double m, double l,double p,double i,double e,double b){
		super(n,pr,m,l,p,i,e,b);		
		}
	public String pourAffichageEtranger(){
		String s=super.pourAffichageEtranger();
		if(this.validation()){s=s+"\nReçu.";}
		else{s=s+"\nAjourné.";}
		return   s;
		}
	public boolean validation(){
		boolean b;
		if(!super.validation()){if(!super.validationEtranger()){return false;}}
		if(super.litteraire()){b=true;}
		else{if(super.litteraireEtranger()){b=true;}
				else{b=false;}
			}
		return b;
		}
}


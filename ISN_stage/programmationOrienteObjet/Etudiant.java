/*
 *  Etudiant.java
 *  yves Mercadier
 * 
 */

public class Etudiant {
	private String prenom,nom;
	private double mathematiques,langue,philosophie,informatique,economie,moyenne,bonus;
	private boolean[] dispense = new boolean[5];
	//constructeur:
	//Entrée: deux chaines de caractére représentant le nom et le prénom de l'étudiant.
	//six doubles compris entre 0 et 20, représentant les notes dans les cinq matiéres et le bonus.
	Etudiant(){
		super();
		}
	Etudiant(String n,String pr,double m, double l,double p,double i,double e){
		super();
		this.nom=n;
		this.prenom=pr;
		this.mathematiques=m;
		this.langue=l;
		this.philosophie=p;
		this.informatique=i;
		this.economie=e;
		this.validation();
		}
	Etudiant(String n,String pr,double m, double l,double p,double i,double e,double b){
		super();
		this.nom=n;
		this.prenom=pr;
		this.mathematiques=m;
		this.langue=l;
		this.philosophie=p;
		this.informatique=i;
		this.economie=e;
		this.bonus=b;
		}
	Etudiant(String n,String pr,double m, double l,double p,double i,double e,boolean[] d){
		super();
		this.nom=n;
		this.prenom=pr;
		this.mathematiques=m;
		this.langue=l;
		this.philosophie=p;
		this.informatique=i;
		this.economie=e;
		this.dispense=d;
		
		}
	public String pourAffichage(){
		String s="\nPrénom                : "+this.prenom
				+"\nNom                   : "+this.nom
				+"\nNote de mathématiques : "+this.mathematiques
				+"\nNote de langue        : "+this.langue
				+"\nNote de philosophie   : "+this.philosophie
				+"\nNote de informatique  : "+this.informatique
				+"\nNote de économie      : "+this.economie
				;
		return   s;
		}
	public String pourAffichageEtranger(){
		String s="\nPrénom                : "+this.prenom
				+"\nNom                   : "+this.nom
				+"\nNote de mathématiques : "+this.mathematiques
				+"\nNote de langue        : "+this.langue
				+"\nNote de philosophie   : "+this.philosophie
				+"\nNote de informatique  : "+this.informatique
				+"\nNote de économie      : "+this.economie
				+"\nBonus                 : "+this.bonus
				;
		return   s;
		}
	public String pourAffichageGeneraliste(){
		String s="\nPrénom                : "+this.prenom
				+"\nNom                   : "+this.nom
				+"\nNote de mathématiques : "+this.mathematiques
				+"\nNote de langue        : "+this.langue
				+"\nNote de philosophie   : "+this.philosophie
				+"\nNote de informatique  : "+this.informatique
				+"\nNote de économie      : "+this.economie
				+"\nDispense              : ";
				;
		for(int i=0;i<this.dispense.length;i++){
			if(this.dispense[i]){
				if(i==0){s=s+"mathématiques ";}
				if(i==1){s=s+"langue ";}
				if(i==2){s=s+"philosophie ";}
				if(i==3){s=s+"informatique ";}
				if(i==4){s=s+"économie ";}
				}
			}
		return   s;
		}
		
	public boolean validation(){
		//évaluation de la moyenne pour la validation de la formation.
		this.moyenne=(this.mathematiques+this.langue+this.philosophie+this.informatique+this.economie)/5;
		//vérification de la contrainte sur les notes.
		boolean b=true;
		if(this.moyenne>=10){b=true;}else{b=false;}
		if(this.mathematiques<6){b=false;}
		if(this.langue<6){b=false;}
		if(this.philosophie<6){b=false;}
		if(this.informatique<6){b=false;}
		if(this.economie<6){b=false;}
		return b;
		}
	public boolean validationEtranger(){
		//évaluation de la moyenne pour la validation de la formation.
		this.moyenne=(this.mathematiques+this.langue+this.bonus+this.philosophie+this.informatique+this.economie)/5;
		//vérification de la contrainte sur les notes.
		boolean b=true;
		if(this.moyenne>=10){b=true;}else{b=false;}
		if(this.mathematiques<6){b=false;}
		if(this.langue<6){b=false;}
		if(this.philosophie<6){b=false;}
		if(this.informatique<6){b=false;}
		if(this.economie<6){b=false;}
		return b;
		}
	public boolean validationGeneraliste(){
		//vérification de la contrainte sur les notes.
		boolean b=true;
		for(int i=0;i<this.dispense.length;i++){
			if(!this.dispense[i]){
				if((i==0)&&(this.mathematiques<10)){b=false;}
				if((i==1)&&(this.langue<10)){b=false;}
				if((i==2)&&(this.philosophie<10)){b=false;}
				if((i==3)&&(this.informatique<10)){b=false;}
				if((i==4)&&(this.economie<10)){b=false;}
				}
			}
		
		return b;
		}
	public boolean litteraire(){
		boolean b;
		//vérification de la contrainte sur les notes d'un étudiant litteraire.
		if((this.langue+this.philosophie)/2>=10){b=true;}else{b=false;}
		return b;
		}
	public boolean litteraireEtranger(){
		boolean b;
		//vérification de la contrainte sur les notes d'un étudiant étranger de litterature.
		if((this.langue+this.bonus+this.philosophie)/2>=10){b=true;}else{b=false;}
		return b;
		}
	public boolean scientifique(){
		boolean b;
		//vérification de la contrainte sur les notes d'un étudiant scientifique.
		if(((this.mathematiques+this.informatique)/2>=10)&&(this.mathematiques>10)){b=true;}else{b=false;}
		return b;
		}
	public boolean economiste(){
		boolean b;
		//vérification de la contrainte sur les notes d'un étudiant economiste.
		if(((this.mathematiques+this.informatique+this.economie)/3>=10)&&(this.economie>10)){b=true;}else{b=false;}
		return b;
		}
	public String nom(){
		return this.nom;
		}
	public static void main (String args[]) {
		System.out.println("\n-->   début du programme \n");
		
		//création d'un étudiant de litterature.
		LitteraireEtranger l1=new LitteraireEtranger("Victor", "Hugo",12,6,6,10,10,5);
		System.out.println(l1.pourAffichageEtranger());
		
		LitteraireEtranger l2=new LitteraireEtranger("Victor", "Hugo2",12,6,9,10,10,5);
		System.out.println(l2.pourAffichageEtranger());

		//création d'un étudiant généraliste dispensé en informatique certainement pour son niveau.
		boolean []tab1={false,false,false,true,false};
		Generaliste g1=new Generaliste("Palaysi","Olivier",11,15,16,3,11,tab1);
		System.out.println(g1.pourAffichageGeneraliste());
		
		//création d'un étudiant généraliste beaucoup trop dispensé.
		boolean []tab2={true,true,true,false,true};
		Generaliste g2=new Generaliste("Cogis","Jérôme",18,18,18,9,18,tab2);
		System.out.println(g2.pourAffichageGeneraliste());
				
		System.out.println("\n-->   fin du programme\n");

	}
}




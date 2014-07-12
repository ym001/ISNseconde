/*
 * Ecran.java
 * Yves Mercadier
 * 
 */ 
import java.util.ArrayList ;

public class  Ecran {
	
// *****************************
// ***** structure de données *****
// *****************************
// dimensions de l'Ecran
private int nbLignes ;
private int nbColonnes ;
// liste des Point de l'Ecran de l'application
private ArrayList<Point> listeDesPoints ;

// constructeur
Ecran(int l,int c){
	this.nbLignes=l;
	this.nbColonnes=c;
	this.listeDesPoints = new ArrayList<Point>() ;

	}
/*	
	* donnée 
	*	aucune
	* résultat
	* 	retourne une chaine de caractère symbolisant l'écran
*/
	public String pourAffichage(){
	String s="";
	for(int i=0;i<nbColonnes+2;i++){s=s+"-";}
	s=s+"\n";
	for(int i=0;i<nbLignes;i++){
		s=s+"|";
		for(int j=0;j<nbColonnes;j++){
				boolean vide=true;
				for (Point p : this.listeDesPoints ){
					if(p.testPoint(j,i)&&(vide)){
						s=s+p.couleur();
						vide=false;
					}
				}
				if(vide){s=s+" ";}
		}
		s=s+"|\n";
	}
	for(int i=0;i<nbColonnes+2;i++){s=s+"-";}
	s=s+"\n";
	return s;
	}
	
/*	
	* donnée 
	*	aucune
	* résultat
	* 	vide la liste de points
*/
public void raz(){
	this.listeDesPoints.clear();
	}

/*	
	* donnée 
	*	un point
	* résultat
	* 	ajoute un point à la liste de points
*/
public void ajouterUnPoint(Point p){
	this.listeDesPoints.add(p);
	}

/*	
	* donnée 
	*	deux entier compris dans les limites de la taille de l'écran
	* résultat
	* 	supprime le premier point de coordonnées x,y de la liste de points si il existe
*/
public void supprimerUnPoint(int x,int y){
	int i=0;
	int index=0;
	boolean sup=false;
	for (Point p : this.listeDesPoints ){
			if(p.testPoint(x,y)){
				sup=true;
				index=i;
			}
			i++;
		}
	if(sup){this.listeDesPoints.remove(index);}
	}

/*	
	* donnée 
	*	un entier compris dans les limites de la taille de l'écran
	* résultat
	* 	modifie la liste des points avec une symérie verticale
*/
public void symetriserSuivantAxeVertical(int numcol){
	for (Point p : this.listeDesPoints )
		{p.symColonne(numcol);
		}
	}

/*	
	* donnée 
	*	un entier compris dans les limites de la taille de l'écran
	* résultat
	* 	modifie la liste des points avec une symérie horizontale
*/
public void	symetriserSuivantAxeHorizontal(int numlig){
	for (Point p : this.listeDesPoints )
		{p.symLigne(numlig);
		}
	}

/*	
	* donnée 
	*	un entier compris dans les limites de la taille de l'écran
	* résultat
	* 	modifie la liste des points avec une symérie centrale
*/
public void	symetriserCentralement(int x,int y){
	symetriserSuivantAxeVertical(x);
	symetriserSuivantAxeHorizontal(y);
	}	
/*	
	* donnée 
	*	aucune
	* résultat
	* 	génère les points pour dessiner un joli carré
*/
public void	dessinerUnCarre(){
	ajouterUnPoint(new Point(2,2,'M'));
	ajouterUnPoint(new Point(3,2,'M'));
	ajouterUnPoint(new Point(4,2,'M'));
	ajouterUnPoint(new Point(5,2,'M'));
	ajouterUnPoint(new Point(5,3,'M'));
	ajouterUnPoint(new Point(5,4,'M'));
	ajouterUnPoint(new Point(5,5,'M'));
	ajouterUnPoint(new Point(4,5,'M'));
	ajouterUnPoint(new Point(3,5,'M'));
	ajouterUnPoint(new Point(2,5,'M'));
	ajouterUnPoint(new Point(2,4,'M'));
	ajouterUnPoint(new Point(2,3,'M'));



	}	
/*	
	* donnée 
	*	aucune
	* résultat
	* 	génère les points pour dessiner un joli triangle
*/
public void	dessinerUnTriangle(){
	ajouterUnPoint(new Point(6,15,'C'));
	ajouterUnPoint(new Point(7,15,'C'));
	ajouterUnPoint(new Point(8,15,'C'));
	ajouterUnPoint(new Point(9,15,'C'));
	ajouterUnPoint(new Point(10,15,'C'));
	ajouterUnPoint(new Point(11,15,'C'));
	ajouterUnPoint(new Point(12,15,'C'));
	ajouterUnPoint(new Point(13,15,'C'));
	ajouterUnPoint(new Point(14,15,'C'));
	
	ajouterUnPoint(new Point(7,14,'C'));
	ajouterUnPoint(new Point(8,13,'C'));
	ajouterUnPoint(new Point(9,12,'C'));
	ajouterUnPoint(new Point(10,11,'C'));
	
	ajouterUnPoint(new Point(11,12,'C'));
	ajouterUnPoint(new Point(12,13,'C'));
	ajouterUnPoint(new Point(13,14,'C'));
	}		

/*	
	* donnée 
	*	aucune
	* résultat
	* 	génère les points pour dessiner un joli canard qui fait coin coin
*/
public void	dessinerUnCanard(){
	
	ajouterUnPoint(new Point(1,8,'J'));
	ajouterUnPoint(new Point(1,9,'J'));
	ajouterUnPoint(new Point(2,9,'J'));
	
	ajouterUnPoint(new Point(4,8,'J'));
	ajouterUnPoint(new Point(4,9,'J'));
	ajouterUnPoint(new Point(5,9,'J'));
	
	}	
}


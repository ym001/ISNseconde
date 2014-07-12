/*
 * Point.java
 * 
 * Copyright 2014  Yves Mercadier
 * 
 */
 
import java.util.ArrayList ;

public class Point {
	private int abscisse;
	private int ordonnée;
	private char couleur;

//constructeur	
Point(int x, int y, char c){
	this.abscisse=x;
	this.ordonnée=y;
	this.couleur=c;
	}
	
/*	
	* donnée 
	*	deux entiers compris dans les limites de la taille de l'écran
	* résultat
	* 	retourne un booléen de valeur true si le point possède les coordonnées x et y
	* false si non
*/	
Boolean testPoint(int x, int y){
	if((this.abscisse==x)&&(this.ordonnée==y)){return true;}
	else{return false;}
	}

/*	
	* donnée 
	*	aucune
	* résultat
	* 	retourne la couleur du point
*/
char couleur(){
	return this.couleur;
	}
	
/*	
	* donnée 
	*	un entier compris dans les limites de la taille de l'écran
	* résultat
	* 	modifie l'abscisse du points pour appliquer une symérie horizontale
*/	
void symColonne(int numcol){	
	this.abscisse=numcol-this.abscisse;
	}

/*	
	* donnée 
	*	un entier compris dans les limites de la taille de l'écran
	* résultat
	* 	modifie l'ordonnée du points pour appliquer une symérie verticale
*/	
void symLigne(int numlig){	
	this.ordonnée=numlig-this.ordonnée;
	}
}


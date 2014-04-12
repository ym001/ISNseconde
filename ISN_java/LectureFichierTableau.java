/*
 Copyright 2014  Yves Mercadier

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.
   

Sujet : Lecture des lignes du fichier data.txt avec la classe scanner.
*/

import java.io.FileReader;
import java.util.Scanner;
 
public class LectureFichierTableau {
  public static void main(String args[]) throws Exception {
	
	//déclaration des variables
	int taille=4; 
	double moyenne=0;
	int tableau[ ] = new int[taille];
	
	//Déclaration du fichier contenant les données.
    FileReader file = new FileReader("data_table.txt");
	
	//Lecture des données.
    Scanner src = new Scanner(file);
	int i=0;
    while (src.hasNext()) {
		
		//Lecture des valeurs.
		String nombre=src.next();
		
		//Affichage des valeurs lues.
		System.out.println(nombre);
		
		//Affectation des valeurs dans un tableau d'entiers.
		tableau[i]=Integer.parseInt(nombre); 
		i++;
    }
    
    //Fermeture du fichier data_table.txt.
    file.close();
    
    //Calcul de la moyenne....
    for(i=0;i<taille;i++){moyenne=moyenne+tableau[i];}
    
    //Affichage de la moyenne.
	System.out.println(moyenne/taille);
  }
  
}

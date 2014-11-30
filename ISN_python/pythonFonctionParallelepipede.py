#/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#  pythonFonctionParallelepipede.py
#  
#  Ecrivez un programme qui calcule le volume d'un parallelepipede rectangle dont sont
#  fournis au depart la largeur, la hauteur et la profondeur.
#
#  Copyright 2014 yves Mercadier <yves.mercadier@ac-montpellier.fr>
#  

#specifications
#parametre : 
#	aucun
#retour : 
#	l un nombre reel representant la longueur du parallelepipede
#	h un nombre reel representant la hauteur du parallelepipede
#	p un nombre reel representant la profondeur du parallelepipede
def entree():
	#Les entrees du programme
	print ("Calcul du volume d'un parallelepipede.\n")
	l = float(input("Indiquez la largeur en (m)?"))
	h = float(input("Indiquez la hauteur en (m)?"))
	p = float(input("Indiquez la profondeur en (m)?"))
	return l,h,p
	
#specifications
#parametre : 
#	l un nombre reel reprsentant la longueur du parallelepipede
#	h un nombre reel representant la hauteur du parallelepipede
#	p un nombre reel representant la profondeur du parallelepipede 
#retour
#	v un nombre reel representant le volume du parallelepipede 
def metier(l,h,p):
	#le calcul
	v=  l*h*p
	return v

#specifications
#parametre : 
#	v un nombre reel representant le volume du parallelepipede
#retour
#	aucun
def pourImpression(v):
	#les sorties du programme
	print ("\nLe volume du parallelepipede est : "+str(v)+" m3.")

print ("   ---> Debut du programme.\n")
largeur,hauteur,profondeur=entree()
volume=metier(largeur,hauteur,profondeur)
pourImpression(volume)
print ("\n   ---> Fin du programme.")

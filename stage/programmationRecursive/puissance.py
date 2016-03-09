#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  puissance.py

#Calcule un nombre nombre à la puissance puissance
#entrée
#nombre est un nombre entier relatif
#puissance est un nombre entier relatif
#Sortie renvoie la valeur de nombre à la puissance puissance.
def puissanceN(nombre,puissance):
	
	if puissance==0 :
		resultat=1
	elif puissance==1 :
		resultat=nombre
	elif puissance==-1 :
		resultat=1/float(nombre)
	elif nombre==0:
		resultat=0
	elif puissance>0:
		resultat=nombre*puissanceN(nombre,puissance-1)
	elif puissance<0:
		resultat=1/float(nombre)*puissanceN(nombre,puissance+1)
		
	return resultat

def main():
	print"\n"
	print"   ---> Début du programme."
	print"Calcul de x à la puissance n."
	x=input(" x = ")
	n=input(" n = ")
	resultat=puissanceN(x,n)
	print x," à la puissance ",n," est égal à ",resultat,"." 
	print"   ---> Fin du programme."
	print"\n"
	return 0

main()


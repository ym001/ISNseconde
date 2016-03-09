#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  logEnBase2DeN.py

#Calcule un nombre nombre à la puissance puissance
#entrée
#nombre est un nombre entier relatif
#puissance est un nombre entier relatif
#Sortie 
#renvoie la valeur de nombre à la puissance puissance.
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

#Entrée :
#nombre un entier positif.
#x un entier null.
#Sortie
#retourne un entier positif ou null représentant la partie entière inférieure du logarithme en base 2 de n.
def logEnBase2DeN(nombre,x):
	
	if puissanceN(2,x)<=nombre :
		x=logEnBase2DeN(nombre,x+1)
	else:
		x=x-1
	if x<0:x=0#test necessaire pour n=0
	
	return x

def main():
	print"\n"
	print"   ---> Début du programme."
	print"Calcul de x à la puissance n."
	n=input(" n = ")
	resultat=logEnBase2DeN(n,0)
	print "La partie entière inférieure du logarithme en base 2 de",n," est égal à ",resultat,"." 
	print"   ---> Fin du programme."
	print"\n"
	return 0

main()


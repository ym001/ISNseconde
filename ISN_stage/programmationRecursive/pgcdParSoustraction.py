#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  pgcdParSoustraction.py

#Calcule le pgcd de deux nombres entiers strictement positifs
#entrée
#n1 un nombre entier strictement positif
#n2 un nombre entier strictement positif
#Sortie 
#renvoie un nombre entier positif pgcd de n1 et n2.
def PGCD(n1,n2):
	if n1==n2:
		pgcd=n1
	if n1>n2 :
		pgcd=PGCD(n2,n1-n2)
	if n1<n2 :
		pgcd=PGCD(n1,n2-n1)
	return pgcd


def main():
	print"\n"
	print"   ---> Début du programme."
	print"Calcul du pgcd de deux nombres entiers positifs."
	n1=input(" n1 = ")
	n2=input(" n2 = ")
	resultat=PGCD(n1,n2)
	print "Le pgcd de ",n1," avec ",n2,"est ",resultat,"." 
	print"   ---> Fin du programme."
	print"\n"
	return 0

main()


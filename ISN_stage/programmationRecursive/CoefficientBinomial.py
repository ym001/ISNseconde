#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  CoefficientBinomial.py

#Calcule le coefficient binomial de deux nombres entiers entiers naturels n et k
#entrée
#n un nombre entier naturel
#k un nombre entier naturel
#Sortie 
#renvoie le coefficient binomial .
def coefficientBinomial(n,k):
	
	if k!=0 and k!=n:
		cb=coefficientBinomial(n-1,k)+coefficientBinomial(n-1,k-1)
	else :
		cb=1
	return cb

def main():
	print"\n"
	print"   ---> Début du programme."
	print"Calcul du coefficient binomial de deux entiers naturels."
	n=input(" n = ")
	k=input(" k = ")
	r=1
	resultat=coefficientBinomial(n,k)
	print "Le coefficient binomial de ",n," avec ",k,"est ",resultat,"." 
	print"   ---> Fin du programme."
	print"\n"
	return 0

main()


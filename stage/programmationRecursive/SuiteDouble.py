#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  SuiteDouble.py


#entrée :
#k un entier positif
#Sortie :
#u un entier positif resultat de la suite double
def un(k):
	if k==0:
		up = 1
	else:
		up = 3*un(k-1) + 2*vn(k-1)
	return up

#entrée :
#k un entier positif
#Sortie :
#v un entier positif resultat de la suite double
def vn(k):
	if k==0:
		vp=1
	else:
		vp = 2*un(k-1) + 3*vn(k-1)
	return vp

#entrée :
#n un entier positif
#Sortie :
#u un entier positif resultat de 5 à la puissance n
def puissanceDeCinq(n):
	if n==0 :
		u=1
	elif n==1 :
		u=5
	elif n>0:
		u=5*puissanceDeCinq(n-1)
	return u
	
def main():
	print"\n"
	print"   ---> Début du programme."
	print"Suite double."
	n=input("Indiquez l'ordre n : ")
	u=un(n)
	v=vn(n)
	print"Un = ",u,"Vn = ",v
	
	
	u=puissanceDeCinq(n)
	print"Un = ",u,"Vn = ",u
	print"   ---> Fin du programme."
	print"\n"
	return 0

main()


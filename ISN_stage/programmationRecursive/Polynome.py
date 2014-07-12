#!/usr/bin/env python
# -*- coding: utf-8 -*-
# évaluation d'un polynome par le schémat de Horner
#  Polynome.py


import random

#Entrée :
#x un nombre réel.
#Sortie :
#retourne un réel représentant la valeur du polynome pour x.
def horner(x,tab):
	liste=tab
	if len(liste)==0:
		p=0
	elif len(liste)==1:
		p=liste[0]
	elif len(liste)==2:
		p=liste[0]+x*liste[1]
	else:
		k=liste[0]
		liste.remove(liste[0])
		p=horner(x,liste)*x+k
	return p

def main():
	print"\n"
	print"   ---> Début du programme."
	print"Calcul d'un polynome."
	n=input("Nombre de coef : n = ")
	tab=[]
	for i in range (n):
		tab.append(input(" a = "))

	print"Evaluation du polynome P:",tab
	x=input(" x = ")
	px=horner(x,tab)
	print "P(",x,")=",px 
	print"   ---> Fin du programme."
	print"\n"
	return 0

main()


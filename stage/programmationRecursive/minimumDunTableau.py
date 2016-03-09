#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  minimumDunTableau.py


import random

#Entrée :
#tab un tableau d'entier.
#Sortie :
#retourne un entier minimum du tableau.
def minimumTableau(tab):
	liste=tab
	if len(liste)<2:
		minimum=liste[0]
	else:
		if liste[0]>=liste[1]:
			liste.remove(liste[0])
			minimum=minimumTableau(liste)
		else:
			liste.remove(liste[1])
			minimum=minimumTableau(liste)

	return minimum

def main():
	taille = random.randint(1,100)
	tab=[]
	for i in range (taille):
		tab.append(random.randint(1,200)-100)
	print"\n"
	print"   ---> Début du programme."
	print"Calcul du minimun du tableau :",tab
	minimum=minimumTableau(tab)
	print "Le minimum du tableau est : ",minimum,"." 
	print"   ---> Fin du programme."
	print"\n"
	return 0

main()


#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  TriComplexite.py
import random

# Données :
# un tableau de nombres entiers relatifs
# Resultat :
# Le tableau de nombres entiers relatifs trié(méthode sélection) par ordre croissant
# ainsi que le dénombrement des comparaisons
def triSelection(tableau):
	compteur=0
	for i in range(0, len(tableau)-1 ):
		indiceMin=i
		minimum=tableau[i]
		for j in range(i+1, len(tableau)):
			if tableau[j] < minimum :
				compteur=compteur+1
				indiceMin = j
				minimum= tableau[j] 
		if indiceMin!=i:
			x=tableau[i]
			tableau[i]=tableau[indiceMin]
			tableau[indiceMin]=x
	return tableau,compteur
# Données :
# un tableau de nombres entiers relatifs
# Resultat :
# Le tableau de nombres entiers relatifs trié(méthode sélection) par ordre croissant
# ainsi que le dénombrement des comparaisons
def triBulle(tableau):
	triOk = False
	compteur=0
	taille =len(tableau)
	while triOk==False:
		triOk=True
		for i in range(0,taille-1 ):
			if tableau[i] > tableau[i + 1]:
				compteur=compteur+1
				x=tableau[i]
				tableau[i]=tableau[i+1]
				tableau[i+1]=x
				triOk = False
		taille = taille -1
	return tableau,compteur
	
# Données : deux tableaux de nombres entier trié par oredre croissant
# Résultat : un tableau trié par ordre croissant résultat de la concaténation des deux tableaux
def fusion (tableau1,tableau2) :
	resultat = []
	i1 = i2 = 0
	while i1<len(tableau1) and i2 < len(tableau2) :
		if tableau1[i1] < tableau2[i2] : 
			resultat.append(tableau1[i1])
			i1=i1+1
		else:
			resultat.append(tableau2[i2])
			i2=i2+1
			
	if i1==len(tableau1) : 
		resultat+=tableau2[i2:]
	else : 
		resultat+=tableau1[i1:]
	return resultat
# Données : deux tableaux de nombres entier trié par ordre croissant
# Résultat : dénombrement des comparaisons pour la concaténation des deux tableaux
def fusionCompteur (tableau1,tableau2) :
	resultat = []
	i1 = i2 = 0
	c=0
	while i1<len(tableau1) and i2 < len(tableau2) :
		
		if tableau1[i1] < tableau2[i2] : 
			resultat.append(tableau1[i1])
			c=c+1
			i1=i1+1
		else:
			resultat.append(tableau2[i2])
			i2=i2+1
	if i1==len(tableau1) : 
		resultat+=tableau2[i2:]
	else : 
		resultat+=tableau1[i1:]
	return c                    
	  
# Données : un tableau d'entier de taille 2 à la puissance n
# Résultat : retourne le tableau trié par ordre croissant
# ainsi que le dénombrement des comparaisons
def triFusion(tableau) :
	N=len(tableau)
	n=1
	tab=tableau
	c=0
	while n<N:
		g=0
		tampon=[]
		while(g<N):
			a=[]
			b=[]
			k=g
			while k<g+n and k<N:
				a.append(tab[k])
				k=k+1
			k=g+n
			while k<g+2*n and k<N:
				b.append(tab[k])
				k=k+1
			tampon+=fusion(a,b)
			c=c+fusionCompteur(a,b)
			g=g+2*n
		n=2*n
		tab=tampon
	return tab,c
 
 
 
 
 
def main():
	taille = 16
	tab=[]
	for i in range (taille):
		tab.append(random.randint(1,100))
	tab1 = tab[:] 
	tab2 = tab[:] 
	tab3 = tab[:] 
	print"\n"
	print"   ---> Début du programme."
	print"\n"
	print"Tri du tableau                           :",tab
	print"\n"
	tab1,compteurSelection=triSelection(tab1)
	print"Tri par sélection                        :",tab1
	print"Dénombrement des comparaisons effectuées :",compteurSelection
	tab2,compteurBulle=triBulle(tab2)
	print"Tri à bulle                              :",tab2
	print"Dénombrement des comparaisons effectuées :",compteurBulle

	tab3,compteurFusion=triFusion(tab3)
	print"Tri par fusion                           :",tab3
	print"Dénombrement des comparaisons effectuées :",compteurFusion

	print"\n   ---> Fin du programme."
	print"\n"
	return 0

main()


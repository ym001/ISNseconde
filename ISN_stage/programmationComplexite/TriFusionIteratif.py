from random import*
#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Fusion de deux listes triees:
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

def TriFusion(tableau) :
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
				print 
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
	#taille = int(input('Entrez la taille de la liste : \n'))
	taille=8
	liste = [randint(1,101) for i in range(taille)]
	print("liste",liste)
	liste,compteur=TriFusion(liste)
	print("liste trie",liste,"compteur :",compteur)
	return 0

main()

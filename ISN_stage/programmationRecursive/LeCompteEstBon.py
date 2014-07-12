#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  LeCompteEstBon.py
import random

#Calcule le coefficient binomial de deux nombres entiers entiers naturels n et k
#Données
#n un nombre entier naturel
#k un nombre entier naturel
#Résultat
#renvoie le coefficient binomial .
def addition(a, b):
	x=a+b
	return x
	
def soustraction(a,b):
	x=a-b
	return x
	
def multiplication(a,b):
	x=a*b
	return x
	
def division(a,b):
	x=a/b
	return x

def parcourt(tab,op):
	liste=tab
	
	for i in range(0,len(tab)):
		for j in range(0,len(tab)):
			for o in range(4):
				if j!=i:
					k=eval(str(tab[i])+op[o]+str(tab[j]))
					liste.append(k)
					print k
		
	return k
		
def compte(tab,v,s):
	liste=tab
	if len(tab)>1:
		#addition
		liste=tab
		a=tab[0]
		b=tab[1]
		radd=addition(a,b)
		rmul=multiplication(a,b)

		if v==radd:
			s=s+" "+str(a)+"+"+str(b)+"=> ok\n"
			liste.append(v)
			compte(liste,v,s)
		elif v==rmul:
			s=s+" "+str(a)+"*"+str(b)+"=> ok\n"
			liste.append(v)
			compte(liste,v,s)
			
		else:
			s=s+" "+str(a)+"+"+str(b)+"=>"
			liste.remove(tab[0])
			liste[0]=radd
			compte(liste,v,s)
			
		#multiplication
		
		
		
	if len(tab)==1:
		#print s+str(tab[0])
		if v==tab[0]:
			s=s+str(tab[0])
			solution.append()
		else:
			s=""
	return solution

def main():
	print"\n"
	print"   ---> Début du programme."
	op=["+","-","*"]
	init=[1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,25,25,50,50,75,75,100,100]
	nombre=[0,0,0,0,0,0]
	valeur = random.randint(1,999)
	for i in range (6):
		nbhasard=init[random.randint(0,27)]
		nombre[i]=nbhasard
	print"Le compte est bon:"
	print nombre
	print "nombre a obtenir : "+str(valeur)
	s=""
	parcourt(nombre,op)
	#solution=compte(nombre,valeur,s)
	#print("solution"+solution)
	print"   ---> Fin du programme."
	print"\n"
	return 0

main()


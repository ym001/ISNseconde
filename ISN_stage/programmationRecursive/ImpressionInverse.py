#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  ImpressionInverse.py

#entrée :
#s une chaine de caractère
#x une chaine de caractère vide
#Sortie :
#x une chaine de caractère résultat de l'inversion de s.

def impression(s,x):
	chaine=s
	if len(chaine)==0:
		print x
		return x
	else:
		x=x+chaine[len(chaine)-1]
		chaine=chaine[0:len(chaine)-1]
		chaine=impression(chaine,x)


def main():
	print"\n"
	print"   ---> Début du programme."
	sd=raw_input("Indiquez une expression : ")
	si=""
	print "L'expression ",sd," inversée nous donne :",impression(sd,si)
	print"   ---> Fin du programme."
	print"\n"
	return 0

main()


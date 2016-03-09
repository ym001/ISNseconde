#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  Hanoi.py

#entrée :
#Sortie :
def hanoi(n,d,a,i):
	if n!=0:
		hanoi(n-1, d, i, a)
		hanoi(n-1, i, a, d)
	return test

def main():
	print"\n"
	print"   ---> Début du programme."
	print"Tour de !Hanoï."
	n=input("Indiquez l'ordre n : ")
	hanoi(n,)
	print"   ---> Fin du programme."
	print"\n"
	return 0

main()


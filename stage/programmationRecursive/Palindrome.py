#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  Palindrome.py

#entrée :
#s une chaine de caractère
#Sortie :
#test une variable booléenne true si s est un palindrome et false si s n'est pas un palindrome
def palindrome(s):
	if len(s)==1 or len(s)==0:
		test=True
	else:
		if s.endswith(s[0]):
			s=s[1:len(s)-1] 
			test=palindrome(s)
		else:
			test=False
	return test

def main():
	print"\n"
	print"   ---> Début du programme."
	print"Vérification d'un palindrome."
	s=raw_input("Indiquez une expression : ")
	s.lower()
	s=s.replace(" ","")
	s=s.replace("é","e")
	s=s.replace("è","e")
	s=s.replace(",","")
	s=s.replace(".","")
	test=palindrome(s)
	if test:
		print "L\'expression ",s," est un palindrome." 
	else:
		print "L'expression ",s," n'est pas un palindrome." 
	print"   ---> Fin du programme."
	print"\n"
	return 0

main()


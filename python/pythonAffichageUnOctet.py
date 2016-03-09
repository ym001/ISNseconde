#/usr/bin/env python3
# -*- coding: utf-8 -*-
from Tkinter import *
from time import sleep
def affiche(dec):
	dessin.itemconfig(oval8,fill='red')
	dessin.itemconfig(oval7,fill='red')
	dessin.itemconfig(oval6,fill='red')
	dessin.itemconfig(oval5,fill='red')
	dessin.itemconfig(oval4,fill='red')
	dessin.itemconfig(oval3,fill='red')
	dessin.itemconfig(oval2,fill='red')
	dessin.itemconfig(oval1,fill='red')
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(oval8,fill='green')
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(oval7,fill='green') 
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(oval6,fill='green')
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(oval5,fill='green')
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(oval4,fill='green')
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(oval3,fill='green')
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(oval2,fill='green')
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(oval1,fill='green')
	dessin.update()

fenetre = Tk()
x, y , dx= 10, 10, 40
dessin = Canvas(fenetre,bg='dark grey',height=50, width=350)
dessin.pack(side=LEFT, padx =5, pady =5)

oval1 = dessin.create_oval(x, y, x+30, y+30, width=0, fill='red')
oval2 = dessin.create_oval(x+dx, y, x+dx+30, y+30, width=0, fill='red')
oval3 = dessin.create_oval(x+2*dx, y, x+2*dx+30, y+30, width=0, fill='red')
oval4 = dessin.create_oval(x+3*dx, y, x+3*dx+30, y+30, width=0, fill='red')
oval5 = dessin.create_oval(x+4*dx, y, x+4*dx+30, y+30, width=0, fill='red')
oval6 = dessin.create_oval(x+5*dx, y, x+5*dx+30, y+30, width=0, fill='red')
oval7 = dessin.create_oval(x+6*dx, y, x+6*dx+30, y+30, width=0, fill='red')
oval8 = dessin.create_oval(x+7*dx, y, x+7*dx+30, y+30, width=0, fill='red')

def feu():
	#
	#Ne rien modifier avant cette ligne.
	#
	#Modifier le code a partir de cette ligne.
	#
	dec=2
	affiche(dec)
	sleep(2)
	affiche(dec+7)
	sleep(2)
	affiche(dec+12)
	#
	#Ne rien modifier apres cette ligne
	#
	sleep(2)
	affiche(0)

bou1 = Button(fenetre,text='Quitter', width =8, command=fenetre.quit)
bou1.pack(side=BOTTOM)
bou2 = Button(fenetre, text='Démarrer', width =8, command=feu)
bou2.pack()	
fenetre.mainloop()



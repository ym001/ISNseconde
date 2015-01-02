#/usr/bin/env python3
# -*- coding: utf-8 -*-
from Tkinter import *
from time import sleep
def affiche(dec):
	global couleurBase
	global couleurAllume
	dessin.itemconfig(segment1,fill=couleurBase)
	dessin.itemconfig(segment2,fill=couleurBase)
	dessin.itemconfig(segment3,fill=couleurBase)
	dessin.itemconfig(segment3,fill=couleurBase)
	dessin.itemconfig(segment4,fill=couleurBase)
	dessin.itemconfig(segment5,fill=couleurBase)
	dessin.itemconfig(segment6,fill=couleurBase)
	dessin.itemconfig(segment7,fill=couleurBase)
	
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(segment1,fill=couleurAllume) 
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(segment2,fill=couleurAllume)
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(segment3,fill=couleurAllume)
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(segment4,fill=couleurAllume)
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(segment5,fill=couleurAllume)
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(segment6,fill=couleurAllume)
	test=dec%2
	dec=dec/2
	if test==1:
		dessin.itemconfig(segment7,fill=couleurAllume)
	dessin.update()

fenetre = Tk()
dessin = Canvas(fenetre,bg='dark grey',height=230, width=150,relief="ridge")
dessin.pack(side=LEFT, padx =5, pady =5)
longueur=50
largeur=10
couleurBase="#888888888"
couleurAllume="#000888000"
segment1=dessin.create_rectangle(50, 30, 50+longueur, 30+largeur, fill=couleurBase, outline=couleurBase)
segment2=dessin.create_rectangle(30, 50, 30+largeur, 50+longueur, fill=couleurBase, outline=couleurBase)
segment3=dessin.create_rectangle(30, 130, 30+largeur, 130+longueur, fill=couleurBase, outline=couleurBase)
segment4=dessin.create_rectangle(50, 190, 50+longueur, 190+largeur, fill=couleurBase, outline=couleurBase)
segment5=dessin.create_rectangle(110, 50, 110+largeur, 50+longueur, fill=couleurBase, outline=couleurBase)
segment6=dessin.create_rectangle(110, 130, 110+largeur, 130+longueur, fill=couleurBase, outline=couleurBase)
segment7=dessin.create_rectangle(50, 110, 50+longueur, 110+largeur, fill=couleurBase, outline=couleurBase)

	#
	#Ne rien modifier avant cette ligne.
	#
	#Modifier le code a partir de cette ligne.
	#
def feu():
	dec=63
	affiche(dec)
	sleep(2)
	dec=6
	affiche(dec)
	#
	#Ne rien modifier apres cette ligne
	#

bou1 = Button(fenetre,text='Quitter', width =8, command=fenetre.quit)
bou1.pack(side=BOTTOM)
bou2 = Button(fenetre, text='Démarrer', width =8, command=feu)
bou2.pack()	
fenetre.mainloop()



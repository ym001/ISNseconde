#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  pythonPremierProgrammeTurtle.py
#  
#  Copyright 2014 yves <yves@pcasus>
#  
from turtle import *

#on donne un nom a notre tortue
martha = Turtle()
#On definit un ecran
scene = Screen()
scene.setup(width=0.5, height=1.0, startx=0, starty=0) 
# width vraie dimension si entier, proportion de l'ecran si decimal
# startx entier, position de l'ecran par rapport a la gauche.

a=0
while a<12:
	a=a+1
	forward(200)
	left(150)

exitonclick()

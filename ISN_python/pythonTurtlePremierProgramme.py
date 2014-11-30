#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  sans titre.py
#  
#  Copyright 2014 yves <yves@pcasus>
#  
from turtle import *
angle = 5
distance = 10
compteur = 0

while compteur <= 30:
    forward(distance)
    left(angle)
    compteur += 1
    angle += 2

exitonclick()

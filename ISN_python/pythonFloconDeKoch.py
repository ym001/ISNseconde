from turtle import *
speed(0)
def koch(n,longueur):
	if n == 0:
		forward(longueur)
	else:
		koch(n-1,longueur/3)
		left(60)
		koch(n-1,longueur/3)
		right(120)
		koch(n-1,longueur/3)
		left(60)
		koch(n-1,longueur/3)

for i in range(5):
	hideturtle()
	koch(i, 300)
	reset()
	
exitonclick()

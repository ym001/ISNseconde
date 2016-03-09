
# Données un nombre entier naturel x
#	un tableau d'entiers naturels 
# Résultat retourne un tableau trié contenant x et les éléments du tableau
 
def insere(x,tab):

	if tab==[]:
		return [x]
	elif x<=tab[0]:
		global compteurFusion
		compteurFusion=compteurFusion+1
		return [x] + tab
		else:	return [tab[0]] + insere(x,tab[1:len(tab)])

 
# Données deux tableaux d'entiers naturels triés
# Résultat concatene les deux tableaux
 
def fusion(tab1,tab2):
 
    if tab1==[]:
        return tab2
    elif tab2==[]:
        return tab1
    else:
        return fusion(tab1[1:len(tab1)],insere(tab1[0],tab2))
 
# Données un tableau de nombres entiers naturels
# Résultat un tableau d'entiers naturels trié par ordre croissant
 
def triFusion(tab):
 
    n=len(tab)
 
    if n==0 or n==1:
        return tab
    else:
        return fusion(triFusion(tab[0:n/2]),triFusion(tab[n/2:n]))       
        		

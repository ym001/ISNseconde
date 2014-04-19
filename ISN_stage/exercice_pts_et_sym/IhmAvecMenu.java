
import java.util.Scanner;

public class IhmAvecMenu
{


	// ************************************
	// *****   structure de données   *****
	// ************************************


	// pour la saisie de données au clavier
	private Scanner clavier = new Scanner(System.in) ;

	// réglages par défaut des écrans	
	private int nbLignes = 16 ;
	private int nbColonnes = 16 ;
	

	// le menu qui permet de gérer interactivement l'application
	private String menu = "\n" 
			+ "voici la liste des actions exécutables :" 
			+ "\n   -1 : afficher le menu"
			+ "\n    0 : quitter l'application"
			+ "\n    1 : afficher l'écran"
			+ "\n    2 : nettoyer l'écran"
			+ "\n    3 : ajouter un nouveau point"
			+ "\n    4 : supprimer tous les points d'une localisation"
			+ "\n    5 : appliquer la symétrie suivant l'axe vertical central"
			+ "\n    6 : appliquer la symétrie suivant l'axe horizontal central"
			+ "\n    7 : appliquer la symétrie centrale"
			+ "\n    8 : dessiner un carré"
			+ "\n    9 : dessiner un triangle"
			+ "\n   10 : dessiner un canard"
			;
	
//	l'option maximum offerte par le menu
	private int maxChoix = 10 ;

	
	// l'écran de l'application
	private Ecran ecranMetier ; 




	// ****************************
	// *****   constructeur   *****
	// ****************************



	/* 
	 * un constructeur sans paramètre
	 * avec initialisation de l'écran de l'application
	 *
	 * donnée 
	 * 	aucune
	 * résultat
	 *	une référence sur une interface homme/machine (IHM) 
	 * 	avec initilisation des dimensions de son attribut Ecran
	 *	fixées de façon interactive
	 */
	public IhmAvecMenu()
	{
		super() ;
		this.ecranMetier = this.initEcran() ;
		afficherMenu();

	} // IhmAvecMenu()




	// *****************************
	// *****   utilitaire(s)   *****
	// *****************************

	// les méthodes ci-dessous constituent le comportement privé de la classe


	/*
	 * une méthode pour saisir une entier
	 * dont on s'assure qu'il est positif
	 *
	 * donnée
	 *	aucune
	 * résulat
	 *	un entier positif saisi  
	 */
	private int saisieEntierPositif()
	{
		int resultat = this.clavier.nextInt() ;
		
		while (resultat<1)
		{
			System.out.println("faites un choix valide, saisissez un entier positif");
			resultat = this.clavier.nextInt() ;
		} // while

		return resultat ;
		
	} // int saisieEntierPositif()



	/*
	 * une méthode pour saisir une entier
	 * dont on s'assure qu'il est compris
	 * entre deux bornes, au sens large
	 *
	 * donnée
	 *	deux entiers relatifs p et q
	 * résulat
	 *	un entier saisi compris 
	 * 	entre p et q bornes comprises
	 */
	private int saisieEntierAvecBornes(int p, int q)
	{
		int resultat = this.clavier.nextInt() ;
		
		while (resultat<p || resultat>q)
		{
			System.out.println("faites un choix valide, saisissez un entier compris entre " +
					p +
					" et " +
					+
					q +
					" bornes comprises) : ");
			resultat = this.clavier.nextInt() ;
		} // while

		return resultat ;
		
	} // int saisieEntierAvecBornes(int p, int q)


	/*
	 * une méthode pour saisir une caractère
	 * dont on s'assure qu'il est l'un 
	 * des caractères précisés
	 *
	 * donnée
	 *	aucune
	 * résulat
	 *	un caractère saisi parmi 'C', 'M', 'J' et 'N' 
	 */
	private char saisieCouleur()
	{
		char resultat = this.clavier.next().charAt(0) ;
		
		while (resultat!='C' && resultat!='M' && resultat!='J' && resultat!='N')
		{
			System.out.println("faites un choix valide, saisissez 'C' ou 'M' ou 'J' ou 'N' : ") ;
			resultat = this.clavier.next().charAt(0) ;
		} // while

		return resultat ;
		
	} // char saisieCouleur()



	/* 
	 * une méthode pour fixer interactivement
	 * les dimensions de l'écran de l'application
	 *
	 * donnée 
	 *	aucune
	 * résultat
	 *	à la demande éventuelle de l'utilisateur
	 *	modifie la valeur par défaut des variables
	 *		this.nbLignes et this.nbColonnes 
	 * 	puis retourne un écran
	 *		de this.nbLignes lignes et this.nbColonnes colonnes
	 */
	private Ecran initEcran()
	{
		System.out.println("\nacceptez-vous les réglages par défaut " +
			"\n(" + this.nbLignes + " ligne(s), " + this.nbColonnes + " colonne(s) ?" +
			"\nsi oui, tapez 'o' ou 'O', sinon n'importe quelle autre chaîne de caractères : ") ;
		String s = this.clavier.next() ;

		if (! s.equals("o") && ! s.equals("O"))
		{
			System.out.println("saisissez le nombre de lignes de l'écran ") ;
			this.nbLignes = this.saisieEntierPositif() ;

			System.out.println("saisissez le nombre de colonnes de l'écran ") ;
			this.nbColonnes = this.saisieEntierPositif() ;
		}

		return new Ecran(this.nbLignes,this.nbColonnes) ;

	} // Ecran initEcran()
	

	
	/* 
	 * une méthode pour afficher le menu de l'application
	 *
	 * donnée 
	 *	aucune
	 * résultat
	 *	retourne une chaîne de caractères dont l'affichage
	 *	est celui du menu de l'application
	 */
	private void afficherMenu()
	{
		System.out.println(this.menu) ;

	} // void afficherMenu()

	
	
	/* 
	 * une méthode pour saisir un entier
	 * correspondant à une option du menu de l'application
	 *
	 * donnée 
	 *	aucune
	 * résultat
	 *	retourne le choix utilisateur de l'action à entreprendre
	 *	sous le forme d'un entier saisi au clavier
	 *	dans les limites des options proposées par le menu
	 */
	private int choixUtilisateur()
	{
		System.out.println("\n" + "\n" + "saisissez votre choix" +
				" (-1 pour voir le menu) : ");
		int resultat = this.saisieEntierAvecBornes(-1, this.maxChoix);		
		
		return resultat;
	
	} // int choixUtilisateur()


	

	/* 
	 * une méthode pour exécuter l'option choisie
	 * dans le menu de l'application
	 *
	 * donnée 
	 *	un entier n représentant une option valide du menu
	 * résultat
	 *	lance l'exécution sur l'écran this.ecranMetier
	 * 	de l'action correspondant à l'option n du menu
	 */
	private void traiterAction(int n)
	{
		int i,j ;
		switch (n)
		{
			case -1 : // afficher le menu
				System.out.println("\n" + "-->   affichage du menu") ;
				this.afficherMenu() ;
				break ;
			case 1 : // afficher l'écran
				System.out.println("\n" + "-->   affichage de l'écran") ;
				System.out.print("\n" + this.ecranMetier.pourAffichage()) ;
				break ;
			case 2 : // effacer l'écran
				System.out.println("\n" + "-->   nettoyage de l'écran") ;
				this.ecranMetier.raz() ;
				System.out.print("\n" + this.ecranMetier.pourAffichage()) ;
				break ;
			case 3 : // créer un point et l'ajouter à l'écran
				System.out.println("\n" + "-->   ligne du nouveau point : ") ;
				i = this.saisieEntierAvecBornes(1,this.nbLignes) ;
				System.out.println("-->   colonne du nouveau point : ") ;
				j = this.saisieEntierAvecBornes(1,this.nbColonnes) ;
				System.out.println("-->   couleur du nouveau point : ") ;
				char c = this.saisieCouleur() ;
				System.out.println("\n" + "-->   ajout d'un point " + i + "," + j + "," + c) ;
				this.ecranMetier.ajouterUnPoint(new Point(i,j,c)) ;
				System.out.print("\n" + this.ecranMetier.pourAffichage()) ;
				break ;
			case 4 : // supprimer de l'écran tous les points d'une localisation à saisir
				System.out.println("\n" + "-->   ligne de la localisation où supprimer : ") ;
				i = this.saisieEntierAvecBornes(1,this.nbLignes) ;
				System.out.println("\n" + "-->   colonne de la localisation où supprimer : ") ;
				j = this.saisieEntierAvecBornes(1,this.nbColonnes) ;
				System.out.println("\n" + "-->   suppression de point(s)") ;
				this.ecranMetier.supprimerUnPoint(i,j) ;
				System.out.print("\n" + this.ecranMetier.pourAffichage()) ;
				break ;
			case 5 : // appliquer la symétrie suivant l'axe vertical central
				System.out.println("\n" + "-->   application de la symétrie suivant l'axe vertical central") ;
				this.ecranMetier.symetriserSuivantAxeVertical(this.nbColonnes);
				System.out.print("\n" + this.ecranMetier.pourAffichage()) ;
				break ;
			case 6 : // appliquer la symétrie suivant l'axe horizontal central
				System.out.println("\n" + "-->   application de la symétrie suivant l'axe horizontal central") ;
				this.ecranMetier.symetriserSuivantAxeHorizontal(this.nbLignes) ;
				System.out.print("\n" + this.ecranMetier.pourAffichage()) ;
				break ;
			case 7 : // appliquer la symétrie centrale
				System.out.println("\n" + "-->   application de la symétrie centrale") ;
				this.ecranMetier.symetriserCentralement(this.nbLignes,this.nbColonnes) ;
				System.out.print("\n" + this.ecranMetier.pourAffichage()) ;
				break ;
			case 8 : // dessiner un carré exemple
				System.out.println("\n" + "-->   dessin d'un carré") ;
				this.ecranMetier.dessinerUnCarre() ;
				System.out.print("\n" + this.ecranMetier.pourAffichage()) ;
				break ;
			case 9 : // dessiner un triangle exemple
				System.out.println("\n" + "-->   dessin d'un triangle") ;
				this.ecranMetier.dessinerUnTriangle() ;
				System.out.print("\n" + this.ecranMetier.pourAffichage()) ;
				break ;
			case 10 : // dessiner un canard
				System.out.println("\n" + "-->   dessin d'un canard") ;
				this.ecranMetier.dessinerUnCanard() ;
				System.out.print("\n" + this.ecranMetier.pourAffichage()) ;
				break ;
			default : ;

		} // switch

	} // void traiterAction(int n)




	// ***************************************
	// *****   comportement contractuel  *****
	// ***************************************

	// les méthodes ci-dessous constituent le comportement public de la classe



	/* 
	 * une méthode pour exécuter les options choisies
	 * interactivement dans le menu de l'application
	 * jusqu'au choix de l'arrêt de l'application
	 *
	 * donnée 
	 *	aucune
	 * résultat
	 *	lance l'exécution de la partie interactive
	 *	de l'application
	 */
	public void dirigerParMenu()
	{
		// création d'un écran
		Ecran unEcran = new Ecran(this.nbLignes,this.nbColonnes) ;

		// affichage du menu et traitement des interactions avec l'utilisateur

		int choix = -1 ;				
		do
		{
			this.traiterAction(choix) ;
			choix = this.choixUtilisateur() ;
		} while (choix != 0) ;

	} // void dirigerParMenu()


} // class IhmAvecMenu



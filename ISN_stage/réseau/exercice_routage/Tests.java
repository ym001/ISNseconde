class Tests{
	public static void main(String args[]){
		// Anneau
		System.out.println("\nTest dans un anneau :");
		Anneau a=new Anneau(9);
		a.envoyer(8,4,"message dans un anneau de 4 à 8");

		// Bus
		System.out.println("\nTest dans un bus :");
		Bus b=new Bus(9);
		b.envoyer(3,7,"message dans un bus (1) de 3 à 7");
		b.envoyer(5,1,"message dans un bus (2) de 5 à 1");

		// Grille
		System.out.println("\nTest dans une grille");
		Grille g=new Grille(4);// grille de 4x4 noeuds
		g.envoyer(2,10,"message dans une grille (1) de 2 à 10");
		g.envoyer(14,5,"message dans une grille (2) de 14 à 5");
	}
}

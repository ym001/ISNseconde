
public class TestEcran
{
	public static void main(String[] args)
	{
		System.out.println("\n\n----->     début de programme (" 
				+ TestEcran.class.getCanonicalName()
				+ ")\n") ;

		// création d'une interface
		IhmAvecMenu ihm = new IhmAvecMenu() ;

		// établissement de l'interface comme maîtresse de l'interaction avec l'utilisateur
		ihm.dirigerParMenu() ;

		System.out.println("\n\n----->     fin de programme (" 
				+ TestEcran.class.getCanonicalName()
				+ ")\n") ;

	} // main

} // public class TestEcran



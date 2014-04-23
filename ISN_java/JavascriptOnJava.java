/*
 * 	Utilisation de la machine javascript en java.
 *  yves.mercadier@ac-montpellier.fr
 * 
 */
import javax.script.*;

public class JavascriptOnJava  {

		public static void main (String args[]) {

			// création d'un gestionnaire de machine.
		    ScriptEngineManager factory = new ScriptEngineManager();
		    
		    // création d'une machine javascript.
		    ScriptEngine engine = factory.getEngineByName("JavaScript");	
			String resultat="";
			Object obj ;
			//évaluation de la chaine de caractère 1+2.
		    try{obj = engine.eval("1+2") ;
				//conversion du résultat en chaine de caractère.
				resultat=obj.toString();
		    }
	    	catch (Exception e) {e.printStackTrace();}
	    	System.out.println("\n-->   début du programme \n");
	    	System.out.println("r="+resultat);
			System.out.println("\n-->   fin du programme\n");

		}
}

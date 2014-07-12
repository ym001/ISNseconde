public class TestFraction {
public static void main(String[] args) { 
System.out.println("\n--> début de programme\n") ;

Utile boiteAOutils = new Utile() ;
int n,m ;

n = boiteAOutils.saisieEntierNaturel() ;
m = boiteAOutils.saisieEntierPositif() ;

Fraction f = new Fraction(n,m) ;
System.out.println("f : " + f.pourAffichage()) ;

n = boiteAOutils.saisieEntierNaturel() ;
m = boiteAOutils.saisieEntierPositif() ;

Fraction g = new Fraction(n,m) ;
System.out.println("g : " + g.pourAffichage()) ;

System.out.println("la somme de f et de g : " + f.plus(g).pourAffichage()) ;

System.out.println("le produit de f par g : " + f.fois(g).pourAffichage()) ;

System.out.println("\n--> fin de programme\n") ;
} // main
} // class TestFraction

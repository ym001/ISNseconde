import java.util.Scanner ;

public class Utile {
private Scanner clavier = new Scanner(System.in) ;

public int saisieEntierNaturel() {
int n ;
do {
System.out.print("entrez un entier naturel : ") ;
n = clavier.nextInt() ;
}
while (n<0) ;
return n ;
}

public int saisieEntierPositif() {
int n ;
do {
System.out.print("entrez un entier positif : ") ;
n = clavier.nextInt() ;
}
while (n<=0) ;
return n ;
}
} // class Utile


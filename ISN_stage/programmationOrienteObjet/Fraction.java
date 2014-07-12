//Fraction Yves Mercadier.
public class Fraction
 {private int numerateur;
 private int denominateur;
 
//constructeur avec pour parametre le dénominateur et le numérateur. 
Fraction(int n,int m){
	super();
	if(n==0){m=1;}
	int p=pgcd(n,m);
	this.numerateur=n/p;
	this.denominateur=m/p;
	}

//constructeur de fraction.
Fraction(){
	super();
	}

//Produit l'affichage conforme à la demande.
public String pourAffichage() {
	return	this.numerateur
			+"/"
			+this.denominateur;
	}
	
//retourne une fraction d'entier résultat de la somme de l'objet fraction avec une fraction f.
public Fraction plus(Fraction f) {
	Fraction fplus=new Fraction();
	fplus.numerateur=f.numerateur*this.denominateur+this.numerateur*f.denominateur;
	fplus.denominateur=this.denominateur*f.denominateur;
	int p=pgcd(fplus.numerateur,fplus.denominateur);
	fplus.numerateur=fplus.numerateur/p;
	fplus.denominateur=fplus.denominateur/p;
	return fplus;
	}
	
//retourne une fraction d'entier résultat de la multiplication de l'objet fraction avec une fraction f.
public Fraction fois(Fraction f) {
	Fraction ffois=new Fraction();
	ffois.numerateur=f.numerateur*this.numerateur;
	ffois.denominateur=this.denominateur*f.denominateur;
	int p=pgcd(ffois.numerateur,ffois.denominateur);
	ffois.numerateur=ffois.numerateur/p;
	ffois.denominateur=ffois.denominateur/p;
	return ffois;
	}

//pgdc implémenté avec l'algorithme d'Euclide.
private int pgcd(int a,int b) {
	int  pgcd=0;
	if(a<b){int x=a;a=b;b=x;}
	int reste=1;
	while(reste!=0){
		if(b!=0){reste=a%b;if(reste==0){pgcd=b;}}
		else{reste=0;pgcd=1;}
		a=b;
		b=reste;
		}
	return pgcd;
	}

} // class Fraction


class NoeudGrille extends Noeud{

	NoeudGrille(int id, int nbVoisins){
		super(id,nbVoisins);
	}
public void router(Paquet p){
		boolean test=false;
		int random=-1;
		while(!test){
			random = (int)(Math.random()*4);
			if(boucle(random)){test=false;}
			else{test=true;}
		}
		envoyer(random, p);
		
	}
}


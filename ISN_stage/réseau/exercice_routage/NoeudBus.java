class NoeudBus extends Noeud{
	
	NoeudBus(int id, int nbVoisins){
		super(id,nbVoisins);
	}
public void router(Paquet p){
			if(this.id()<p.destination()){envoyer(1, p);}
			if(this.id()>p.destination()){envoyer(0, p);}
	}
}

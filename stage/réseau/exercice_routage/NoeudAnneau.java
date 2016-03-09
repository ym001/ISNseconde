class NoeudAnneau extends Noeud{

	public NoeudAnneau(int id, int nbVoisins){
		super(id,nbVoisins);
	}
	public void router(Paquet p){
		envoyer(1, p);
	}

}

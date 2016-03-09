/*
 *  Promotion.java
 *  yves Mercadier
 * 
 */

import java.util.ArrayList;

public class Promotion {
	private ArrayList<Etudiant> ensembleDesEtudiants= new ArrayList<Etudiant>();
	Promotion(){
		super();		
		}
	public String pourAffichage(){
		String s="";
		for(int i = 0 ; i < this.ensembleDesEtudiants.size(); i++){
			s = s+this.ensembleDesEtudiants.get(i).nom()+"\n";
		}
		return   s;
		}
	public void add(Scientifique s){
		ensembleDesEtudiants.add(s);
		}
	public void add(Litteraire l){
		ensembleDesEtudiants.add(l);
		}
	public void add(Economiste e){
		ensembleDesEtudiants.add(e);
		}
}


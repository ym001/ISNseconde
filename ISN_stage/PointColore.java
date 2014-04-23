public class PointColore extends Point {
	private String couleur;
	PointColore(int i, int j,String s){
		super(i,j);
		this.couleur=s;
		}
	public String pourAffichagePoint(){
		return super.pourAffichagePoint()
				+"coloré"
				+super.pourAffichageCoord()
				+"je suis de couleur "+this.couleur+"\n";
		}
		
}

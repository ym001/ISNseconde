public class PointColore extends Point {
	private String couleur;
	private int x,y;
	PointColore(int i, int j,String s){
		super();
		this.couleur=s;
		this.x=i;
		this.y=j;
		}
	public void pourAffichagePointColore(){
		System.out.println("Je suis un point coloré");
		System.out.println("mes coordonnées sont : "+this.x+" "+this.y);
		System.out.println("je suis de couleur "+this.couleur+"\n");
		}
		
}

/*
 * des points et des points colorés 
 *  yves Mercadier
 * 
 */


public class Point {
	private int x,y;
	Point(int i, int j){
		super();
		this.x=i;
		this.y=j;
		}
	Point(){super();}
	public String pourAffichagePoint(){
		return "\nJe suis un point ";
		}
	public String pourAffichageCoord(){
		return "\nmes coordonnées sont : "+this.x+" "+this.y+"\n";
		}
	public static void main (String args[]) {
		System.out.println("\n-->   début du programme \n");
		Point p1=new Point(5,12);
		TestPoint t1=new TestPoint(p1);
		PointColore p2=new PointColore(-3 ,4,"rouge");
		TestPoint t2=new TestPoint(p2);
		PointColore p3=new PointColore(13 ,7,"bleu");
		TestPoint t3=new TestPoint(p3);
		Point p4=new Point(-2 ,-9);
		TestPoint t4=new TestPoint(p4);
		System.out.println("-->   fin du programme\n");

	}
}




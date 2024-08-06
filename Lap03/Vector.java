package lap3;

public class Vector {
	public double x,y,z;
	
	public Vector() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Vector(double p1,double p2,double p3) {
		this.x = p1;
		this.y = p2;
		this.z = p3;
	}
	
	public void printVector() {
		System.out.println("( "+x+","+y+","+z+" )");
	}


	public static void main(String[] args) {
		Vector v1 = new Vector();
		Vector v2 = new Vector(2,3,4);
		System.out.print("Vector v1 : ");
		v1.printVector();
		System.out.print("Vector v2 : ");
		v2.printVector();
	}

}

package lap3;

public class Box {
	 public double width;
	 public double height;
	 public double depth;
	 //public double sum;

	 public double getVolume() {
		  return width*height*depth;
	 }
	 
	 /*public void setDimension(double width, double height, double depth) {
		 this.width = width;
		 this.height = height;
		 this.depth = depth;
	 }*/
	 
	 public Box(double width, double height, double depth){
		 this.width = width;
		 this.height = height;
		 this.depth = depth;
	 }
}

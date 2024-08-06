package lap3;

public class TestBox {
	public static void main(String[] args) {
		Box b = new Box(2,2,2);
		//box1.setDimension(3, 4, 5);
		System.out.println(("before resize ")+b.getVolume());
		resizeBox(b, 2);
		System.out.print(("after resize ")+b.getVolume());
	}
	public static void resizeBox(Box b,int fold) {
		b.width = b.width*fold;
		b.height = b.height*fold;
		b.depth = b.depth*fold;
	}
	
}
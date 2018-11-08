package typeCasting;

public class ShapeMain {

	public static void main(String[] args) {
		Shape shape = new Rectangle(12.2, 2.4);
		System.out.println("The area of the rectangle is: " + shape.area());
		Rectangle rect = (Rectangle)shape;
		rect.show();
		
	}

}

package typeCasting;

public class Rectangle extends Shape {
	
	public Rectangle(double d1, double d2) {
		super(d1,d2);
	}
	
	public void show() {
		System.out.println("the given dimensions are " + dim1 + " " + dim2);
	}

	public double area() {
		return dim1*dim2;
	}
	

}

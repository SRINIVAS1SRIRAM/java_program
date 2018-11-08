package typeCasting;

public class UseCalculator implements Calculator {
		
	@Override
	public double add(double var1, double var2) {
		// TODO Auto-generated method stub
		return var1+var2;
	}

	@Override
	public double sub(double var1, double var2) {
		// TODO Auto-generated method stub
		return var1-var2;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("the addition of two numbers is: " + this.add(1,2));
		System.out.println("the subtraction of two numbers is: " + this.sub(4,2));
	}
	
	public static void main(String  arg[]) {
		Calculator c = new UseCalculator();
		UseCalculator obj = new UseCalculator();
		obj.show();
		c.show();
	}

}

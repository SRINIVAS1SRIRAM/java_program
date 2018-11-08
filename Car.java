package car;

public class Car {
	int minSpeed = 0;
	int maxSpeed = 100;
		
	double weight = 4000;
	
	boolean isTheCarOn = false;
	char condition = 'A';
	String carName = "Lucy";
	
	double maxFuel = 16;
	double currentFuel = 8;
	double mpg = 24.6;
	
	int numberOfPeopleInTheCar = 1;
	
	public void printVariables() {
		System.out.println("The maximum speed of the car is: " + maxSpeed);
		System.out.println("The minimum speed of the car is: " + minSpeed);
		System.out.println("The weight of the car is: " + weight);
		System.out.println("Is the car is ON? " + isTheCarOn);
		System.out.println("The Condition is " + condition);
		System.out.println(carName);
		System.out.println("The number of People in the car is: " + numberOfPeopleInTheCar);
	}
	
	public void upgradeMinSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed + 1;
	}
	public void getIn() {
		numberOfPeopleInTheCar++;
	}
	
	public void getOut() {
		numberOfPeopleInTheCar--;
	}
	
	public double howManyMilesTillOutOfGas() {
		return currentFuel * mpg;
	}
	
	public double maxMilesPerFill() {
		return maxFuel * mpg;
	}
	
	public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;
	}

	public static void main(String[] args) {
		Car birthdayPresent = new Car(500, 5000.30, true);
		System.out.println("Birthday Present v1");
		birthdayPresent.printVariables();
		birthdayPresent.getIn();
		birthdayPresent.getIn();
		birthdayPresent.getIn();
		System.out.println("Miles Left:" + birthdayPresent.howManyMilesTillOutOfGas());
		System.out.println("Max Miles:" + birthdayPresent.maxMilesPerFill());
		System.out.println("Birthday Present v2");
		birthdayPresent.printVariables();
		birthdayPresent.getOut();
		System.out.println("Birthday Present v3");
		birthdayPresent.printVariables();
		
		
		
	//	Car christmasPresent = new Car(550, 2000, false);
	//	System.out.println("Christmas Present");
	//	christmasPresent.printVariables();		
	}

}

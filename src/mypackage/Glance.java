package mypackage;
import java.util.*;

public class Glance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mark[] = new double[5];
		double sum = 0;
		Scanner scan = new Scanner(System.in);
		String a = "Hello";
		System.out.printf("%-6s", a);
		System.out.println(123);
		for(int i=0; i<5; i++) {
			System.out.print("Enter your mark: ");
			mark[i]=scan.nextDouble();
			System.out.println();
			sum=sum+mark[i];
		}
		System.out.println("The sum of the mark is: " +sum);
		scan.close();
	}

}

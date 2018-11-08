package typeCasting;
import java.util.*;

public class GreatestN {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 5;
		int arr[]=new int[n];
		for(int i=1; i<=n; i++) {
			System.out.println("Enter your " +i+ "element");
			arr[i-1]=scan.nextInt();
		}
		int Smallest=arr[0], Largest=0;
		for(int i=0; i<n; i++) {
			if(arr[i]>Largest) {
				Largest=arr[i];
			}
			if(arr[i]<Smallest) {
				Smallest=arr[i];
			}
		}
		System.out.println("The Largest Number is: " + Largest);
		System.out.println("The Smalles Number is: " + Smallest);
		scan.close();

	}

}

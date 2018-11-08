package mypackage;
import java.util.*;
public class HelloWorld{

	public static void main(String arg[]) {
		int j;
		System.out.println("Enter the total number of elements: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the element to find: ");
		int num = scan.nextInt();
		for(j=0; j<n; j++) {
			if(arr[j]==num) {
				System.out.println("Number " +num+ "found at index number " +j);
				break;
			}
			
		}
		if(j==n) {
			System.out.println("Number not found");
		}
		scan.close();
	}
	
	
	
}

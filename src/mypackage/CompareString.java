package mypackage;
import java.util.*;
public class CompareString {
	public static void main(String arg[]) {
		String s1,s2;
		int n1,n2,i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first String:");
		s1=scan.next();
		System.out.println("Enter your second String: ");
		s2=scan.next();
		n1=s1.length();
		n2=s2.length();
		if(n1!=n2) {
			System.out.println("The given two Strings are differnt");
		}
		else {
			for(i=0;  i<n1; i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					System.out.println("The given two Strings are different");
					break;
				}
			}
			if(i==n1) {
				System.out.println("The given two Strings are Same");
			}
		}
		scan.close();
		
	}
}

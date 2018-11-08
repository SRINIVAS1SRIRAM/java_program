package mypackage;
import java.util.*;
public class PrimeNumber {
   	 public static void main(String args[]){    
		  int i,m=0,temp=0,n;      
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter a number to find whether it is prime or not:");
		  n=scan.nextInt();  
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not a Prime number");      
		  }
		  else{  
			  for(i=2;i<=m;i++){      
				  if(n%i==0){      
					  System.out.println(n+" is not a Prime number");      
					  temp=1;      
					  break;      
				  }      
			  }      
		   if(temp==0){
			   System.out.println(n+" is a Prime Number");
			   }  
		  }
		  scan.close();
		}    
		

}

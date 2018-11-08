package typeCasting;

import java.util.*;

public class RegexDemo {

	public static void main(String[] args) {
		ArrayList listItem=new ArrayList();
		
		listItem.add("Sunil");
		listItem.add("Anil");
		listItem.add("Rohit");
		listItem.add("Wasim");
		
		//Here the integer literals added to the Collection
		//Actually when we add integer literal internally it will create the Integer object 
		//and then it will added
		listItem.add(789);
		listItem.add(456);
		
		//Displaying the Collection Elements
		for(Object e:listItem)
		{
			
			if(e instanceof String)
			{
			
			System.out.println("String Object:"+e);
			}
			else
			{
			
			System.out.println("Integer Object:"+e);
			}
		
		}

	}
}



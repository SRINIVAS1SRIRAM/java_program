package mypackage;

public class StringDemo2 
{
	public static void main(String arg[])
	{
		
		byte buffer[]= {65,66,67,68,69};
		
		System.out.println(new String(buffer));
		
		String byteString=new String(buffer);
		
		System.out.println("String Created using Byte Array:"+byteString);
		
		
		char name[]= {'S','u','d','h','i','r'};
		
		String charString=new String(name);
		
		System.out.println("String created using Character Array:"+charString);
		
		
	}

	
}
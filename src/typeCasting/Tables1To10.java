package typeCasting;

public class Tables1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1, b=10, c,d;
		for(c=a; c<=b; c++) {
			System.out.println(c + "Tables");
			for(d=1; d<=10; d++) {
				System.out.println(c +"*"+ d + "=" + (c*d));
			}
		}

	}

}

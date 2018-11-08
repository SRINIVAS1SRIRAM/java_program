package typeCasting;

public class SyncDemo {
	
	public synchronized static void withDraw(String arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(Thread.currentThread().getName()+"::::"+ arr[i]);
		}
	}

}

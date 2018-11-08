package typeCasting;

public class UseSyncDemo extends Thread {
	
	String transactions[]= {"Enter Pin","Enter Amount","Check Balance","Process Tran","Update Balance","Finish"};
	@Override
	public void run() {
		SyncDemo.withDraw(transactions);
		
	}

	public static void main(String[] args) {
		UseSyncDemo T1 = new UseSyncDemo();
		UseSyncDemo T2 = new UseSyncDemo();
		
		T1.setName("Fist");
		T2.setName("Fight");
		T1.start();
		T2.start();
		

	}

}

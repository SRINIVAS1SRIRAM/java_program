package typeCasting;

public class ThreadDemo1 extends Thread{
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+":::::::"+i);
			System.out.println(Thread.currentThread());
		}
	}

	public static void main(String[] args) {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo1 T2 = new ThreadDemo1();
		
		T1.setName("FIRST");
		T2.setName("SECOND");
		
		T1.start();
		T2.start();

	}

}

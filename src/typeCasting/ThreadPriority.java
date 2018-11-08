package typeCasting;
import java.util.*;

public class ThreadPriority extends Thread {
	public synchronized void run() {
		System.out.println("running thread name is: " + Thread.currentThread().getName());
		System.out.println("running thread priority is: " + Thread.currentThread());
	}
	
	public static void main(String arg[]) {
		ThreadPriority s1 = new ThreadPriority();
		ThreadPriority s2 = new ThreadPriority();
		s1.start();
		s2.start();
		
	}

	
}

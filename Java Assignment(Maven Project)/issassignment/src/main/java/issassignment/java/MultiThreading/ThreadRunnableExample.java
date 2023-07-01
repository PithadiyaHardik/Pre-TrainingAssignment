package issassignment.java.MultiThreading;


//This example demonstrate thread creation using Runnable interface
class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread using runnable " + Thread.currentThread().getName() + " started");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Thread using runnable " + Thread.currentThread().getName() + " Completed");

	}

}
public class ThreadRunnableExample {
	public static void main(String[] args) {
		
		ThreadRunnable r1=new ThreadRunnable();
		ThreadRunnable r2=new ThreadRunnable();
		ThreadRunnable r3=new ThreadRunnable();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}

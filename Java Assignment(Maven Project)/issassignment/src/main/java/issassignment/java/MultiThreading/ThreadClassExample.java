package issassignment.java.MultiThreading;

//This example demonstrate the thread creation using Thread class

class ThreadClass extends Thread {
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " started");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " Completed");
	}
}



public class ThreadClassExample {

	public static void main(String[] args) {
		ThreadClass t1=new ThreadClass();
		ThreadClass t2=new ThreadClass();
		ThreadClass t3=new ThreadClass();
		t1.start();
		t2.start();
		t3.start();

	}
}

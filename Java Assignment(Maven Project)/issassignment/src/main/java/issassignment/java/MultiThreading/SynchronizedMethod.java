//This method demonstrate the method synchronization in multithreading.
package issassignment.java.MultiThreading;

class Printer
{
	//Synchronized mthod
	synchronized void print(String threadName)
	{
		System.out.println("Thread "+threadName+" Started printing: ");
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}


class PrintClass extends Thread
{
	Printer p=null;
	PrintClass(Printer print,String threadName)
	{
		super(threadName);
		this.p=print;
	}
	
	public void run()
	{
		p.print(Thread.currentThread().getName());
	}
}


public class SynchronizedMethod {
	public static void main(String[] args) {
		
		Printer p=new Printer();
		PrintClass t1=new PrintClass(p,"Thread 1");
		PrintClass t2=new PrintClass(p,"Thread 2");
		PrintClass t3=new PrintClass(p,"Thread 3");
		t1.start();
		t2.start();
		t3.start();
	}

}

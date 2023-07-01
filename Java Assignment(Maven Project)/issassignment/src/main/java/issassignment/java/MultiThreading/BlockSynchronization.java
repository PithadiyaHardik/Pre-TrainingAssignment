//This program demonstrate the block synchronization in multithreading.

package issassignment.java.MultiThreading;


class TablePrinter
{
	void print(String threadName)
	{
		System.out.println("Thread "+threadName+" Started printing: ");
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}


class TablePrintClass extends Thread
{
	TablePrinter p=null;
	
	TablePrintClass(TablePrinter print,String threadName)
	{
		super(threadName);
		this.p=print;
	}
	
	public void run()
	{
		//block synchronization
		synchronized(p)
		{
			p.print(Thread.currentThread().getName());	
		}
		
	}
}


public class BlockSynchronization {
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

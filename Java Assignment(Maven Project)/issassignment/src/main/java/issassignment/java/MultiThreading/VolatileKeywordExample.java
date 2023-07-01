//This program demonstrate the use of volatile keyword

package issassignment.java.MultiThreading;
class VolatileData   
{  
private volatile int counter = 0;   
public int getCounter()   
{  
return counter;  
}  
public void increaseCounter()   
{  
++counter;     
}  
}  
class VolatileThread extends Thread   
{  
private final VolatileData data;  
public VolatileThread(VolatileData data)   
{  
this.data = data;         
}  
@Override  
public void run()  
{  
int oldValue = data.getCounter();  
System.out.println("[Thread " + Thread.currentThread().getName() + "]: Old value = " + oldValue);  
data.increaseCounter();  
int newValue = data.getCounter();  
System.out.println("[Thread " + Thread.currentThread().getName() + "]: New value = " + newValue);  
}  
}  

public class VolatileKeywordExample {
public static void main(String[] args) throws InterruptedException{
	
	VolatileData data=new VolatileData();
	VolatileThread t=new VolatileThread(data);
	VolatileThread t1=new VolatileThread(data);
	VolatileThread t2=new VolatileThread(data);
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
}
}

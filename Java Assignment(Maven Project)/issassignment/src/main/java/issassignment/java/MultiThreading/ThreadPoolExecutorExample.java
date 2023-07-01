//This program demonstrate the ThreadPoolExecuter.

package issassignment.java.MultiThreading;

import java.util.concurrent.Executors;  
import java.util.concurrent.ThreadPoolExecutor;  


class SumCalculator implements Runnable{
	int start;
	int end;
	
	SumCalculator(int start,int end){
		this.start=start;
		this.end=end;
	}
	public void run() {
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			sum+=i;
		}
		System.out.println("Sum from "+ start +" to "+  end +" is : "+sum);
	}
}


public class ThreadPoolExecutorExample {
public static void main(String[] args) {
	//Creating ThreadPoolExecutor
	 ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newCachedThreadPool(); 
	 
	 SumCalculator s1=new SumCalculator(1,10);
	 SumCalculator s2=new SumCalculator(1,20);
	 SumCalculator s3=new SumCalculator(1,30);
	 SumCalculator s4=new SumCalculator(1,40);
	//Adding runnable jobs in it
	 executor.submit(s1);
	 executor.submit(s2);
	 System.out.println("Pool size : "+ executor.getPoolSize());
	 executor.submit(s3);
	 executor.submit(s4);
	 System.out.println("Pool size : "+ executor.getPoolSize());
	 executor.shutdown();

	 
}
}

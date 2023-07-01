//This program demonstrate the use of arrays in java

package issassignment.java.Basic;

public class Arrays {
	
	
	public static void main(String[] args) {
		
		int[] singleDimArray=new int[5]; //declaration single dimensional array.
		//initialization
		singleDimArray[0]=10;
		singleDimArray[1]=20;
		singleDimArray[2]=30;
		singleDimArray[3]=40;
		singleDimArray[4]=50;
		
		//Traversing 
		System.out.println("Single dimenssional array:");
		for(int i=0;i<singleDimArray.length;i++)
		{
			System.out.println(singleDimArray[i]);
		}
		
		int[][] multiDimArray=new int[2][2];//creating multi dimensional array(int his case 2d array).
		//initialization
		multiDimArray[0][0]=123;
		multiDimArray[0][1]=456;
		multiDimArray[1][0]=789;
		multiDimArray[1][1]=109;
		//Traversing 
		System.out.println("Two dimenssional array:");
		for(int i=0;i<multiDimArray[0].length;i++)
		{
			for(int j=0;j<multiDimArray.length;j++)
			{
				System.out.print(multiDimArray[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println();
		
		
		//Copying array 
		int copyFrom[] = {1,2,3,4,5,6,7,8};
		int copyTo[]=new int[8];
		System.arraycopy(copyFrom, 0, copyTo, 0, 7);
		System.out.println("Copied array");
		for(int i=0;i<copyTo.length;i++)
		{
			System.out.print(copyTo[i]+ " ");
		}
			
		System.out.println();
		
		//Cloning array
		int[] clonedArray=singleDimArray.clone();
		System.out.println("Original array:");
		for(int i=0;i<singleDimArray.length;i++)
		{
			System.out.print(singleDimArray[i]+ " ");
		}
		System.out.println();
		System.out.println("Cloned array:");
		for(int i=0;i<clonedArray.length;i++)
		{
			System.out.print(clonedArray[i]+ " ");
		}
		System.out.println();
		System.out.println("Is cloned and original array same :"+(singleDimArray==clonedArray));
		
		
		
		
			
		
		
		
		
		
		
	}

}

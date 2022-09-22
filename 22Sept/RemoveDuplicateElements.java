/* */

import java.util.Scanner;
import java.util.Arrays;

class RemoveDuplicateElements
{

	static int[] myArr;
	
	// Creating arraysize method
	static void arraysizeInput()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size=sc.nextInt();
		myArr=new int[size];
		
	static void printArray(int arr[])
    {
	        for(int i:arr)
	    {
		   System.out.println("Enter the elements");
	    }
    } 
		
		
	
	
	// Creating displayArray method
	static void displayArray(int []arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(+arr[i]+" ");
		}
		
	}
	
	// displayDuplicateElements method
	static void displayDuplicateElements()
	{
		
		for(int i=0;i<myArr.length;i++)
		{
			
			for(int j=i+1;j<myArr.length;j++)
			{
				
				if(myArr[i]==myArr[j])
				{
					System.out.print(myArr[i]+" ");
					 
					break;
				}
			}
		}
	}
	
	 //removeDuplicateElements method
	
	static void removeDuplicateElements()
	{
		// Sorting the array 
		Arrays.sort(myArr);
		
		int[] newArr =new int[myArr.length];
		
		for(int i=0;i<myArr.length;i++)
		{
			 
			for(int j=i+1;j<myArr.length;j++)
			{
				
				if(myArr[i]!=myArr[j])
				{
				
					newArr[j]=myArr[j];
				}
			}
		}
		
		myArr=newArr.clone();
		
		System.out.print("The new array is : ");
		displayArray(myArr);
	}
	
	// Calling main method
	public static void main(String...args)
	{
		
		arraysizeInput();
		System.out.print("The orignal array is : ");
		displayArray(myArr);
		System.out.println();
		System.out.print("The duplicate elements are : ");
		displayDuplicateElements();
		System.out.println();
		removeDuplicateElements();
	}
	
}
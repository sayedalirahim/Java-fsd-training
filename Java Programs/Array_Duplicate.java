package java_training;

import java.util.Scanner;

public class Array_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size =sc. nextInt();
		int []arr1 = new int [size];
		System.out.println("Enter the elements of the array");
		for (int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Repeated element in the array are");
		
		for (int i=0;i<size;i++)
		{
			int cout=0;
			for (int j=i+1;j<size;j++)
			{
				if( arr1[i]==arr1[j] && i!=j) {
			
						System.out.print(arr1[j]+",");
				}
			}
				
			
		}
	
	
	
	
	

	
	
	
	}

}

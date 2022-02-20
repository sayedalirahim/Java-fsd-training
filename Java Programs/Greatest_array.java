package java_training;

import java.util.Scanner;

public class Greatest_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int max;
		int len = sc.nextInt();
		int[] ar1 = new int[len];
		System.out.println("Enter the elements for array: "); 
		for(int i=0;i<len;i++)
		{
			ar1[i] = sc.nextInt();
		}
		System.out.println("");
	
		System.out.println("The elements in the array: ");
		for (int i=0;i<len;i++)
		{
			System.out.print(ar1[i]+",");
		}
		
		
		max= ar1[0];
		for (int j=0;j<len;j++)
		{
			if (max < ar1[j])
			{
				max=ar1[j];
			}
		}
		
	System.out.println();
	System.out.println("The maximum number in the array is  "+max);
	}
	
	

}

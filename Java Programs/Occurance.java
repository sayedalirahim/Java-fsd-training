package java_training;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size=sc.nextInt();
		int [] arrX= new int [size];
		
		System.out.println("Enter the elements of the array");
		for (int i=0;i<size;i++)
		{
			 arrX[i]=sc.nextInt();
		}
		System.out.println("The elements in the array are");
		for (int i=0;i<size;i++)
		{
			System.out.print(arrX[i]+",");
		}
		System.out.println();
		System.out.println("Enter the integer value to count occurance");
		int x=sc.nextInt();
		for (int i=0;i<size;i++)
		{
			if ( x==arrX[i])
					{
				      count++;
					}
		
		}
		
		System.out.println();
		System.out.println("The number of occurance "+count);
		
		
	}

}

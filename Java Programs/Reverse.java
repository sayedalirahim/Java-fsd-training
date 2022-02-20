package java_training;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = sc.nextInt();
		String[] aryX = new String [size];
		String[] aryZ = new String [size];
		System.out.println("Enter the elements in the array");
		for (int i=0;i<size;i++)
		{
			aryX[i]=sc.next();
		}
		System.out.println("The elements in the array are");
		for (int i=0;i<size;i++)
		{
			System.out.print(aryX[i]+",");
		}
		System.out.println();
		
		for (int i=0;i<size;i++)
		{
			aryZ[i]=aryX[i];
		
		}
		System.out.println("Reversed Order is  ");
		for (int i=size-1;i>=0;i--)
		{
			System.out.println(aryZ[i]);
		}
	}

}

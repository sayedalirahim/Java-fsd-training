package java_training;

import java.util.Scanner;

public class Chara_InString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String txt=	sc.next();
		
	System.out.println("Enter the number of charachers you want to check presence in the string");
		int size=sc.nextInt();
		System.out.println("enter the characters");
		char[] ctrs= new char[size];
		for (int i=0;i<size;i++)
		{
			ctrs[i]=sc.next().charAt(i);
			
		}
	
		for (int i=0;i<size;i++)
		{
			System.out.println(ctrs[i]);
		}

	}

}

       
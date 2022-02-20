package java_training;

import java.util.Scanner;

public class statements {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		
		System.out.println("Enter a Positive integer number");
		int a=s.nextInt();
		
		if (a>0) {
			for (int i=1; i<=10;i++) {
			   int p= a*i;
			   System.out.println(a+"*"+i+"="+p );
			}
	     
		}
		else
		{
			System.out.println("Entered number is not a positive integer");
		}
			
}
		
}
package java_training;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first string ");
		String txt1=sc.nextLine();
		System.out.println("Enter the second string ");
		String txt2=sc.nextLine();
		
	
			int result=txt1.indexOf(txt2);
			System.out.println(result);
			
			if (result!=-1)
			{
				System.out.println(txt2 +"  is present and its a substring  ");
			}
	
			else
			{
				System.out.println(txt2+"  is NOT a substring  ");	
			}
	
	}

}

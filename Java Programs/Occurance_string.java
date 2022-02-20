package java_training;

import java.util.Scanner;

public class Occurance_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the character");
		char c = sc.next().charAt(0);
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==c)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println(c+" is not present in given string ");
		}
		else
		{
			System.out.println(c+" is present in given string with "+count+" times");
		}
	}

}

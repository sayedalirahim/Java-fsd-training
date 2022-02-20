package java_training;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the string ");
			String s1 =sc.next();
			char[] c=s1.toCharArray();
//			System.out.println("Character are are ");
//			for (int i=0;i<c.length;i++)
//			{
//				System.out.println(c[i]+" , ");
//			}
			
			System.out.println("  ");
			System.out.println("Reversed array :");
			for(int i=c.length-1;i>=0;i--)
			{
				System.out.print(c[i]);
			}
//			char ch;
//			String rev="";
//			for (int i=0; i<s1.length();i++)
//			{
//				ch=s1.charAt(i);
//				rev=ch+rev;
//			}
//	
//	System.out.println();
//	System.out.println("Reversed character array to string " +rev);
//	
	
	}

}

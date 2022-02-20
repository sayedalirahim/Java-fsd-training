package java_training;

import java.util.Scanner;

public class TernaryOperator2 {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int num1,num2,num3;
			
			
			System.out.println("Enter first Number");
			num1 =s.nextInt();
			
			System.out.println("Enter second Number");
			num2 =s.nextInt();
			
			System.out.println("Enter third Number");
			num3 =s.nextInt();
			
			int result =(num1<num2)? (num1<num3?num1:num3): (num2<num3? num2:num3);
			System.out.println("Smallest Number is  " +result);
			
			}
}

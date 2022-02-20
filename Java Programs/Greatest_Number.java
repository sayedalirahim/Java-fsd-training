package java_training;
import java.util.Scanner;
public class Greatest_Number {
	static int number1, number2;
	public static void main(String[] args) {
		 
	      Scanner scan = new Scanner(System.in);
	      int largest;
	      System.out.print("Enter the First Number: ");
	      number1 = scan.nextInt();
	      System.out.print("Enter the Second Number: ");
	      number2 = scan.nextInt();
	      
	      if(number1>number2)
	         largest = number1;
	      else
	         largest = number2;
	      
	      System.out.println("Largest number is " +largest);

	}
	
}

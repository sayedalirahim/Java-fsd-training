package java_training;
import java.util.Scanner;
public class Arithmatic_Operations {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		  
		   int number1, number2;
		   
		   System.out.print("Enter first number: ");
		   number1 = scan.nextInt();
		   
		   System.out.print("Enter second number: ");
		   number2 = scan.nextInt();

		   int sum,sub,mult,div;
		   sum = number1 + number2;
		   sub=  number1 - number2;
		   mult= number1 * number2;
		   div=  number1 / number2;
		  
		   System.out.println("Summation = " + sum);
		   System.out.println("Substraction = " + sub);
		   System.out.println("multiplication = " + mult);
		   System.out.println("division = " + div);
	}

}

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int a=0,b=1,sum=0;
		System.out.println("Fibonacci series: ");
		
		while(sum <= num)
		{
			System.out.print(sum+" ");
			a=b;
			b=sum;				
			sum=a+b;
			
		}
		sc.close();
	}

}

package java_training;

import java.util.Scanner;

public class Employee_Data {
	public static float EmployeeBonus(float y)
	{
		float bonus=(5*y)/100;
		return bonus+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary");
		int Salary = sc. nextInt();
		System.out.println("Enter year of service");
		int year= sc.nextInt();
		
		if(year<5)
		{
		System.out.println("You are not applicable for bonus");
		}
		else {
			float bonus = EmployeeBonus(Salary);
			System.out.println("Your upgraded net bonus amount"+bonus);
		}
	}
}
		
		
	



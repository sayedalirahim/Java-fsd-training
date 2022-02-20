package java_training;

import java.util.Scanner;

public class EmployeeData {
	
	public static int LoyalityBonus(int sal,int yr)
	{
		int bon=0;
		if(yr<=2017 && sal>30000)
		{
			bon = (sal*22)/100;
		}
		else if(yr<=2017 && sal<30000)
		{
			bon = (sal*33)/100;
		}
		else if(yr<=2012)
		{
			bon = (sal*40)/100;
		}
		else if(yr>2017 && sal<30000)
		{
			bon = (sal*15)/100;
		}
		else if(yr>2017 && sal>30000)
		{
			bon = (sal*10)/100;
		}
		return bon;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);	
		System.out.println("Enter employee name");
		String Name= sc.next();
		System.out.println("Enter Salary");
		int salary= sc.nextInt();	
		System.out.println("Enter year of joining");
		int Year= sc.nextInt();
		int result = LoyalityBonus(salary,Year);
		System.out.println("The Loyality Bonus of "+Name+" is "+result);
	}

	}
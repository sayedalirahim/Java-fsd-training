package java_training;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no.of classes held");
			float a = sc.nextFloat();
			System.out.println();
			System.out.println("Enetr no.of classes attented");
			float b= sc.nextFloat();
			float percent =(b/a)*100;
			System.out.println("Percentage of classes atteneted is : "+percent+"%");
			if(percent < 75) 
			{
				System.out.println("Candidate is NOT allowed to write exam ");
			}
				
			else {
				
				System.out.println("Candidate is  allowed to write exam ");
			}
	}

}

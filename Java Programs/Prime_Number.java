package java_training;
import java.util.Scanner;
public class Prime_Number {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int count,len=0;
		int []ar =new int[n];
		for(int i=2 ; i<n ; i++) {
			count=0;
			for(int j=2 ;j<= i/2 ; j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}}
	if(count==0) 
	{
		ar[len]=i;
		len++;
	}}
		System.out.println("The array elements are: ");
		for(int x=0 ;x<len ; x++)
		{
			System.out.print(ar[x]+" ");
		}}
}
		
		
		
		
		
		
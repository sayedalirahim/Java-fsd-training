import java.util.Scanner;
import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int size;
			size=sc.nextInt();
		
			int[] ar1= new int[size];
			int[] ar2= new int[size];
			int[] sum= new int[size];
			
			System.out.println("Enter the elements in the first array");
			for (int i=0;i<size;i++)
			{
				ar1[i]=sc.nextInt();
			}
			
			System.out.println("Enter the elements in the second array");
			for (int i=0;i<size;i++)
			{
				ar2[i]=sc.nextInt();
			}
			
			for (int i=0;i<size;i++)
			{
				sum[i]=ar1[i]+ar2[i];
			}
				System.out.println("Elements in the array before sorting");
			System.out.println(Arrays.toString(sum));
			
			for (int i=0;i<size-1;i++)
			{
				int min=i;
				
				for (int j=i+1;j<size;j++)
				{
					if(sum[j]<sum[min])
						{
							min=j;
						}
							
				}
			
			int temp = sum[i];
			sum[i]= sum[min];
			sum[min]=temp;
			
			
			}
			System.out.println();
			System.out.println("Elements after sorting :");
			System.out.println(Arrays.toString(sum));
			sc.close();
				
			
			
	
	}

}

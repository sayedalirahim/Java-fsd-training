import java.util.Scanner;

public class Palindrome {

	
		// TODO Auto-generated method stub
		static boolean Palin(String str)
		{
			int x=0,y=str.length()-1; 
			while(x<y)
			{
				if(str.charAt(x)!=str.charAt(y))
				{
					return false;
				}
				x++;
				y--;
			}
			
			return true;
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String str = sc.next();
			
			if(Palin(str))
			{
				System.out.println("Is a palindrome");
			}
			else
			{
				System.out.println("Not a palindrome");
	}

		}
}
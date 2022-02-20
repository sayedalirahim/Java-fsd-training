
public class Num_Palin {

	
	
		static boolean isPalin(String str)
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
				int count = 11;
				int palinFound = 0;
				while(palinFound<10)
				{
					if(isPalin(Integer.toString(count)))
					{
						System.out.print(count);
						palinFound++;
						if(palinFound%10!=0)
						{
							System.out.print(",");
						}
						else
						{
							System.out.print("");
						}
					}
					count++;
				}
			}

	}
package java_training;

public class MethodOver2 {
	static void exp(int a,double b)
	{
			double c=b/a;;
			System.out.println(c);
			
	}
	static void exp(String myText,int b)
	{
		System.out.println("Output Will be:" +myText+"  "+b);
	}
	static void exp(char a,char b,float c)
	{
		System.out.println(a+" "+b+" "+c);
		
	}
	static void exp(boolean myBool)
	{
		System.out.println(myBool+"  "+myBool);
	}
	public static void main(String[] args) {
		exp(true);
		exp('B','Y',4);
		
		exp("Hello",3);
		exp(3,10);
}
}

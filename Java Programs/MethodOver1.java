package java_training;

public class MethodOver1 {
	static void ser()
	{
			System.out.println("No Value");
	}
	static void ser(int x)
	{
			System.out.println(x*x);
	}
	static void ser(int x,int y)
	{
			System.out.println(x*y);
	}
	static void ser(int x,int y,int z)
	{
			System.out.println(x*y*z);
	}
	public static void main(String[] args) {
		ser();
		ser(2);
		ser(6,2);
		ser(2,3,2);
	}
}
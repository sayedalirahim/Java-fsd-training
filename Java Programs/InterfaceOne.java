package java_training;

interface Dog{
	void bark();
	void run();
}
public class InterfaceOne implements Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceOne ex = new InterfaceOne();
		ex.bark();
		ex.run();
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog is barking.....");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Dog is running...");
	}

}

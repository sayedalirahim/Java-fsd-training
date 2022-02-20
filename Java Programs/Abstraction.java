package java_training;

abstract class Cat {
	public void type() {
		System.out.println("Persian Cat");
		
	}
	public abstract void run();
	public abstract void sound();
}
class NewCat extends Cat {
	
	public void run() {
		System.out.println("Cat says hello");
	}
	
	public void sound() {
		System.out.println("Cat says hai");
	}
}public class Abstraction {

	
	public static void main(String[] args) {
		Cat c = new NewCat();
		c.type();
		c.run();
		c.sound();
	}}

	
      
	

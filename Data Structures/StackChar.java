import java.util.Stack;

public class StackChar {

	public static void main(String[] args) {
		Stack<Character> Charstk= new Stack<>();  
		// checking stack is empty or not  
		boolean result = Charstk.empty();  
		System.out.println("Is the stack empty? " + result);  
		// pushing elements into stack  
		Charstk.push('M');  
		Charstk.push('L');
		Charstk.push('N');
		Charstk.push('X');
		Charstk.push('Z');
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + Charstk);  
		result = Charstk.empty();
		//System.out.println("Is the stack empty? " + result);  
		
		Charstk.pop();
		System.out.println("The last element is: "+Charstk.peek());
		System.out.println("The position of N in the stack is: "+Charstk.search('N'));
		
		
		
		

	}

}

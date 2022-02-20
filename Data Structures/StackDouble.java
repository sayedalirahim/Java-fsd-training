import java.util.Stack;

public class StackDouble {
	public static void main(String[] args) {
		Stack<Double> dSTACK = new Stack<>();  
		// checking stack is empty or not  
		boolean result = dSTACK.empty();  
		System.out.println("Is the stack empty? " + result);  
		// pushing elements into stack  
		dSTACK.push(1.02); 
		dSTACK.push(40.05);
		dSTACK.push(18.36);
		dSTACK.push(48.5);
		dSTACK.push(35.00);
		
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + dSTACK);  
		result = dSTACK.empty();
		//System.out.println("Is the stack empty? " + result);  
		
		//dSTACK.pop();
		System.out.println("The last element is: "+dSTACK.peek());
		System.out.println("The position of 48.5 in the stack is: "+dSTACK.search(48.5));
	
	
}}

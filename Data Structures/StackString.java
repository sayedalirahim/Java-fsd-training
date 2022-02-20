import java.util.Stack;

public class StackString {
	public static void main(String[] args) {
		Stack<String> STACK = new Stack<>();  
		// checking stack is empty or not  
		boolean result = STACK.empty();  
		System.out.println("Is the stack empty? " + result);  
		// pushing elements into stack  
		STACK.push("WATER"); 
		STACK.push("FLOWER");
		STACK.push("MOON");
		STACK.push("RAIN");
		STACK.push("WAVES");
		
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + STACK);  
		result = STACK.empty();
		//System.out.println("Is the stack empty? " + result);  
		
		STACK.pop();
		System.out.println("The last element is: "+STACK.peek());
		System.out.println("The position of RAIN in the stack is: "+STACK.search("RAIN"));
	}}
	
	


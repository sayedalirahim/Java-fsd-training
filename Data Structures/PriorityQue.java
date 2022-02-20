import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQue {
	public static void main(String[] args) {

        
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(12);
        numbers.add(23);
        System.out.println("PriorityQueue: " + numbers);
        
        int number = numbers.peek();
        System.out.println("Accessed Element: " + number);
        
        boolean result = numbers.remove(5);
        System.out.println("Is the element 2 removed? " + result);

       
        int rem = numbers.poll();
        System.out.println("Removed Element : " + rem);
        
        System.out.println("checking element 4 is in queue1: "+ numbers.contains(4));
        
        
	}}
        
       
       
	
	


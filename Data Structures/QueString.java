import java.util.LinkedList;

import java.util.Queue;

import java.util.ArrayList;
public class QueString {

	public static void main(String[] args)
	{
	Queue<String> que1= new LinkedList<>();
	Queue<String> que2= new LinkedList<>();
	que1.add("Grapes");
	que1.add("Mango");
	que1.add("Apple");
	System.out.println("Initial queue "+ que1);
	que1.remove();
	System.out.println("after remove queue 1" +que1);
	
	String head = que1.peek();
	System.out.println("head of que1-" +head);
	
	que2.add("Watermelon");
	que2.add("Orange");
	que1.addAll(que2);
	System.out.println("after addAll" +que1);
	
	int size=que2.size();
	System.out.println("size of queue 2 is "+size);
	que2.clear();
	System.out.println("after clear() check if queue2 is empty: "+ que2.isEmpty());
	System.out.println("checking element Grapes is in queue1: "+ que1.contains("Grapes"));}
	
}

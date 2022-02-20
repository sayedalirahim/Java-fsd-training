import java.util.LinkedList;

import java.util.Queue;

import java.util.ArrayList;
public class QueueChar {
	public static void main(String[] args)
	{
	Queue<Character> que1= new LinkedList<>();
	Queue<Character> que2= new LinkedList<>();
	que1.add('a');
	que1.add('b');
	que1.add('c');
	que1.add('d');
	System.out.println("Initial queue "+ que1);
	que1.remove();
	System.out.println("after remove queue 1" +que1);
	que2.add('z');
	que2.add('y');
	que1.addAll(que2);
	System.out.println("after addAll" +que1);

	int size=que2.size();
	System.out.println("size of queue 2 is  "+size);
	que2.clear();
	System.out.println("after clear() check if queue2 is empty: "+ que2.isEmpty());
	System.out.println("checking element 'd' is in queue1: "+ que1.contains('d'));
	           
	}
	
	
}

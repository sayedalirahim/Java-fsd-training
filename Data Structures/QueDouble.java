
import java.util.LinkedList;
import java.util.Queue;
public class QueDouble {
	
	public static void main(String[] args)
	{
	
	Queue<Double> que1= new LinkedList<>();
	Queue<Double> que2= new LinkedList<>();
	que1.add(80.3);
	que1.add(75.2);
	que1.add(65.4);
	que1.add(55.7);
	System.out.println("Initial queue "+ que1);
	que1.remove();
	System.out.println("after remove queue1 " +que1);
	que2.add(80.3);
	que1.addAll(que2);
	System.out.println("after addAll" +que1);

	int size=que2.size();
	System.out.println("size of queue2 is "+size);
	que2.clear();
	System.out.println("after clear() check if queue2 is empty: "+ que2.isEmpty());
	System.out.println("checking element 80.3 is in queue1: "+ que1.contains(80.3));
	           
	}
	
}

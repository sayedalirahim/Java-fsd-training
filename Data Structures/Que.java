import java.util.LinkedList;
	import java.util.Queue;
	import java.util.ArrayList;

public class Que {

	
	
		public static void main(String[] args)
		{
				Queue<Integer> q= new LinkedList<>();	
	            
	            for (int i = 0; i < 5; i++)
	            {
	            	q.add(i);
	            }
	            System.out.println("Elements of queue "+ q);
	                           
	            int removeble = q.remove();
	            System.out.println("removed element-"+ removeble);
	                           
	            System.out.println(q);
	            int head = q.peek();
	            System.out.println("head of q-" +head);
	            int size = q.size();
	            System.out.println("Size of queue-"+ size);
	             System.out.println("Is que empty ? "+q.isEmpty()); 
	            
	             
	                                          
		}
	}


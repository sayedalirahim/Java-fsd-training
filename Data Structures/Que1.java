import java.util.LinkedList;

import java.util.Queue;

import java.util.ArrayList;

public class Que1 {

	public static void main(String[] args)

    {

		 Queue<Integer> q= new LinkedList<>();
		
		
		
		for (int i = 0; i < 5; i++)
		
		   q.add(i);
		
		System.out.println("Elements of queue "+ q);
		
		              
		
		int removedele = q.remove();
		
		System.out.println("removed element-"+ removedele);
		
		              
		
		System.out.println(q);
		
		int head = q.peek();
		
		System.out.println("head of q-" +head);
		
		int size = q.size();
		
		System.out.println("Size of queue-"+ size);
		
		System.out.println("is the queue is empty?"+q.isEmpty());              
		
		ArrayList<Integer> list=new ArrayList<>();   
		
		list.add(6);
		
		list.add(7);
		
		q.addAll(list);
		
		System.out.println("queue after addAll is "+q);
		
		    }
			
		}

import java.util.LinkedList;
public class LinkedList1 {
	 static ListNode head;
	 
	 static class ListNode{
		 int data;
		 ListNode next;
	 
		 
		 ListNode(int data){
		this. data=data;
		this. next=null;
		 }}
	 
	 static void display()
	 {
		 ListNode current=head;
		 while(current!=null) {
			 System.out.print(current.data + "--->" );
			 current=current.next;
		 }
	 System.out.println("null");
	 }
	 
	 
	 
public static void main(String[] args) {
	LinkedList1 l1=new LinkedList1();
	
	l1.head=new  ListNode(10);
	ListNode second=new ListNode(14);
	ListNode third=new ListNode(5);
	ListNode fourth=new ListNode(12);
	
	l1.head.next=second;
	second.next=third;
	third.next=fourth;
	
	l1.display();
	
			
	
	
}
}	

 
			 


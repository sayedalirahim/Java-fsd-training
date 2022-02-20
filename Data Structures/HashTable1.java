import java.io.*;
import java.util.Hashtable;
public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, Character> ht1 = new Hashtable<>();
		
		Hashtable<Integer, Character> ht2 = new Hashtable<>();
		
		
		ht1.put(1, 'A');
        ht1.put(2, 'K');
        ht1.put(3, 'E');
  
        ht2.put(4, 'S');
        ht2.put(5, 'X');
        ht2.put(6, 'G');
		
		
		System.out.println(ht2.keySet());
		
		
		
	}

}

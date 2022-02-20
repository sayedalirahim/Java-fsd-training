import java.io.*;
import java.util.*;

class AddElementsToHashtable {
	public static void main(String args[])
	{
		
		Hashtable<Double, Character> ht1 = new Hashtable<>();

		
		Hashtable<Double, Character> ht2
			= new Hashtable<Double, Character>();

		
		ht1.put(0.1, 'G');
		ht1.put(0.2, 'F');
		ht1.put(0.3, 'G');

		ht2.put(0.1, 'G');
		ht2.put(0.2, 'F');
		ht2.put(0.3, 'G');
		
		
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
	}
}
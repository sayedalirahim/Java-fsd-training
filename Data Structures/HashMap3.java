import java.util.HashMap;
import java.util.Map;
public class HashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(5, "Roy");
		map.put(2, "Ren");
		map.put(6, "Tom");
		map.put(4, "Aby");
		
		for(Map.Entry<Integer,String> e : map.entrySet())
		
		 System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
			
	}

}

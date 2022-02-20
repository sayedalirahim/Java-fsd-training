import java.util.HashMap;
public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map= new HashMap<>();
		
		map.put("Vishal", 8);
		map.put("Tom", 25);
		map.put("Xavi", 15);
		map.put("Mat", 3);
		
		System.out.println("Size of the map is "+ map.size());
	
		System.out.println(map);
	
		if (map.containsKey("Vishal")) {
			
			int a=map.get("Vishal");
			System.out.println("The value for key"+" \"Vishal\" is "  +a);
		}
	
	
	
	
	
	}
	
	
	
	
}

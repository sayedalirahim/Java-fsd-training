import java.util.HashMap;
public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map1 =new HashMap<>();
		
		HashMap<String,Integer> map2 =new HashMap<String,Integer>();
		
		map1.put("tom", 15);
		map1.put("ren", 5);
		map1.put("roy", 12);
		
		map2.put("aby", 1);
		map2.put("son", 25);
		map2.put("peter", 23);
		
		
		
		System.out.println(map1);
		System.out.println(map2);
	System.out.println(map1.keySet());
	System.out.println(map1.values());
	map2.remove("son");
	System.out.println(map2.keySet());
	System.out.println(map2);
	System.out.println(map2.entrySet());
	System.out.println(map1.get("ren"));
	
	}

}

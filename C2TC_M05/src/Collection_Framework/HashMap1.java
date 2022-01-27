package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
	HashMap<Integer,String>map=new HashMap<Integer,String>();
	//creating HashMap
	map.put(1, "Mango");
	map.put(2, "Banana");
	map.put(3, "Apple");
	map.put(4, "Grapes");
	map.put(5, null);
	map.put(null,"berry");
	
	System.out.println("Iteraing HashMap....");
	
	for(Map.Entry m:map.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	
	}
	}

}

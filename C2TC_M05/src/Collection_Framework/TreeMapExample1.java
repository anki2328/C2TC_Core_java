package Collection_Framework;

import java.util.*;

public class TreeMapExample1 
{

	
	public static void main(String[] args) {
		
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(100, "ankita");
		map.put(108,"shraddha");
		map.put(103, "pooja");
		map.put(99, "Anshu");
		map.put(105, null);
		//map.put(null,"Sanskruti");
		
		
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		

	}

}

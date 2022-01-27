package Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add(new LinkedList());
	ll.add("hii");
	ll.add("Hello");
	ll.add("0,20");
	ll.add("ankita");
	ll.add("28,23");
	ll.remove(2);
	//System.out.println(ll);
     Iterator i1=ll.iterator();
     while(i1.hasNext())
     {
    	 Object o=i1.next();
    	 System.out.println(o);
     }

	
	
	
	}

}

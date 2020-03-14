package javanissi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class MapEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Java");
		ar.add("testing");
		ar.add("oracle");

		HashSet<String> hs=new HashSet<String>();
		hs.add("India");
		hs.add("china");
		hs.add("japan");

		PriorityQueue<String> pq= new PriorityQueue<String>();
		pq.add("apple");
		pq.add("orange");
		pq.add("mango");

		 Map<String,Collection> map =new HashMap<String,Collection>();
		 
		  map.put("List",ar);
		  map.put("Set",hs);
		  map.put("Queue",pq);
		  
		Set entries=map.entrySet();
		Iterator itr=entries.iterator();

		while(itr.hasNext())
		{
		Map.Entry me=(Map.Entry)itr.next();
		   System.out.println(me.getKey()+" "+me.getValue());

		}
		}


}

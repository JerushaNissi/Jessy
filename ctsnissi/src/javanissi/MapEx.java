package javanissi;
import java.util.*;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		Object rest=hm.put("k1", "miss");
		System.out.println(rest);
		hm.put("k1", "india");
		hm.put("k2", "isreal");
		hm.put("k3", "jerusalem");
		hm.put("k4", "rome");
		hm.put("k5", "india");//duplicate values are allowed
		hm.put("k1", "Canada");//duplicate key values not allowedd 
		//in this case old value is overided {k1=Canada, k2=isreal, k3=jerusalem, k4=rome, k5=india}
		
		Object obj=hm.put("k1", "Nissi");
		System.out.println(obj);
		
		Object m=hm.remove("k5");
		System.out.println(m);
		
		Set keys=hm.keySet();
		System.out.println(keys);
		System.out.println(hm.keySet());
		
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(hm.entrySet());
		
		Set entries=hm.entrySet();
		Iterator itr1=entries.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		while(itr1.hasNext()) {
			Map.Entry me=(Map.Entry)itr1.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		//System.out.println(hm);
	}

}

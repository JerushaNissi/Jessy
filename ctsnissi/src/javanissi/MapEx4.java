package javanissi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm=new HashMap<String, String>();
		ArrayList<String> ar=new ArrayList<String>();
		hm.put("1001", "IndiA");
		hm.put("1002", "Isreal");
		hm.put("1003", "JerusaleM");
		hm.put("1004", "romE");
		hm.put("1005", "India");
		System.out.println(hm);
		
		Set entries=hm.entrySet();
		Iterator itr=entries.iterator();
		while(itr.hasNext())
		{
		Map.Entry me=(Map.Entry)itr.next();
			{
				String str=(String) me.getValue();
				//System.out.println(me.getValue());
				if(str.charAt(0)>=97 && str.charAt(0)<=123 && str.charAt(str.length()-1) >=65 && str.charAt(str.length()-1)<=90)
				{
					ar.add(str);
				}
			}
		}
		System.out.println("The names that satisfying the condition are::");
		for(String s:ar)
		{
			System.out.println(s);
		}
	}

}

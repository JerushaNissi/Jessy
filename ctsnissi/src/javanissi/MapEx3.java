package javanissi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;

class ClgGroups{
	String dept1;
	String dept2;
	String dept3;
	public ClgGroups(String dept1, String dept2, String dept3) {
		super();
		this.dept1 = dept1;
		this.dept2 = dept2;
		this.dept3 = dept3;
	}
	@Override
	public String toString() {
		return "ClgGroups [dept1=" + dept1 + ", dept2=" + dept2 + ", dept3=" + dept3 + "]";
	}
}

public class MapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<String,ClgGroups> m1 =new HashMap<String,ClgGroups>();
		ClgGroups cg1=new ClgGroups("cse","ece","it");
		ClgGroups cg2=new ClgGroups("it","aero","mca");
		ClgGroups cg3=new ClgGroups("inst","eee","mech");
		ClgGroups cg4=new ClgGroups("mech","civil","ece");
		ClgGroups cg5=new ClgGroups("it","cse","aero");
		m1.put("Jntu-H",cg1);
		m1.put("Jntu-K",cg2);
		m1.put("Jntu-A",cg3);
		m1.put("Jntu-B",cg4);
		m1.put("Jntu-J",cg5);
		//System.out.println(m1);
		//Map to Entries
		Set entries=m1.entrySet();
		//System.out.println(m1.entrySet());
		//Entries to Iterator
		Iterator itr=entries.iterator();
		System.out.println("Enter the department u wish for:");
		String str=sc.nextLine();
		System.out.println("u selected for::"+str);
		while(itr.hasNext())
		{
		Map.Entry me=(Map.Entry)itr.next();
		ClgGroups cg = (ClgGroups)me.getValue();//getting value from cg groups and typecasting it
			if(cg.dept1.equals(str)||cg.dept2.equals(str)||cg.dept3.equals(str)) 
			{
				System.out.println("The clg that offers u selected course:");
				System.out.println(me.getKey());
			}

		}
	}

}

package javanissi;
import java.util.*;
import java.util.HashSet;
class Employ{
	String empid;
	String name;
	public Employ(String empid, String name)
	{
		super();
		this.empid = empid;
		this.name = name;
	}
	public Employ() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employ [empid=" + empid + ", name=" + name + "]";
	}
}

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ emp=new Employ();
		HashSet hs=new HashSet();
		hs.add("Nissi");
		hs.add("Jermy");
		hs.add("Jesus");
		hs.add("Joel");
		hs.add("Johanna");
		System.out.println(hs);
		HashSet hs1= new HashSet();
		hs1.add(new Employ("2","Nissi"));
		hs1.add(new Employ("1","Lissi"));
		hs1.add(new Employ("3","Missi"));
		System.out.println(hs1);
		
		hs1.forEach(System.out::println);
	}

}

package javanissi;
import java.util.*;

public class CollectionArrayExample {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("java");
		al.add("Selenium");
		al.add(null);
		al.add(true);
		al.add(07);
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		al1.add("nissi");
		al1.add("jermy");
		
		al.addAll(al1);
		
		System.out.println(al);
		al1.add("jessy");
		System.out.println(al1);
		if(al.containsAll(al1))
			System.out.println("Found");
		else
			System.out.println("notfound");
	}

}

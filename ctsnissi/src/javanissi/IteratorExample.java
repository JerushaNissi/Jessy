package javanissi;
import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("java");
		al.add("Selenium");
		al.add(null);
		al.add(true);
		al.add(07);
		System.out.println(al);
		Iterator itr = al.iterator();
		System.out.println(itr.next());//it will give the present value and move to next
		while(itr.hasNext())//it will iterate till the last element in the last
			System.out.println(itr.next());
	}

}

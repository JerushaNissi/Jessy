package javanissi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;


public class ListIteratorExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();

		ar.add("java");
		ar.add("Dotnet");
		ar.add("selenium");

		System.out.println(ar);

		/*Iterator itr=ar.iterator();

		while(itr.hasNext())
		System.out.println(itr.next());*/

		ListIterator itr1 =ar.listIterator();

		while(itr1.hasNext())
		System.out.println(itr1.next());

		System.out.println("elements in reverse order...");
		/*System.out.println(itr1.next());//throws error*/

		while(itr1.hasPrevious())
		System.out.println(itr1.previous());
	}
}

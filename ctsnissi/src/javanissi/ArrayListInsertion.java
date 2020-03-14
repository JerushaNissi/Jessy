package javanissi;
import java.util.*;

public class ArrayListInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("red");
		al.add("white");
		al.add("yellow");
		System.out.println("Before insertion:");
		System.out.println(al);
		System.out.println("After insertion:");
		al.add(1, "Jesus");
		System.out.println(al);
	}

}

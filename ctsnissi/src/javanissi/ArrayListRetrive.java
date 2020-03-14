package javanissi;
import java.util.*;

public class ArrayListRetrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("red");
		al.add("white");
		al.add("yellow");
		System.out.println("Before retreving:");
		System.out.println(al);
		System.out.println("After reteving:");
		al.get(0);
		System.out.println(al.get(0));
	}

}

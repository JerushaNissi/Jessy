package javanissi;
import java.util.*;

public class SortEleInArray {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("red");
		al.add("white");
		al.add("yellow");
		al.add("black");
		al.add("cyan");
		al.add("grey");
		al.add("pink");
		al.add("violet");
		System.out.println("Before Sorting");
		System.out.println(al);
		System.out.println("After Sorting");
		Collections.sort(al);
		System.out.println(al);
	}

}

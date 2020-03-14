package javanissi;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();

		ar.add("java");
		ar.add("Dotnet");
		ar.add("selenium");
		System.out.println("Original");
		System.out.println(ar);
		System.out.println("sorted");
		Collections.sort(ar);
		System.out.println(ar);
		System.out.println("Reverse sorted");
		Collections.reverse(ar);
		System.out.println(ar);
		
		
		System.out.println("Before Copying");
		ArrayList arnew=new ArrayList(5);
		System.out.println(arnew);
		arnew.add("java");
		arnew.add("Dotnet");
		arnew.add("selenium");
		System.out.println("After Copying");
		Collections.copy(arnew, ar);
		System.out.println(arnew);
		
		System.out.println("Before filling");
		System.out.println(ar);
		Collections.fill(ar, "Jesus");
		System.out.println("After Filling");
		System.out.println(ar);
	}

}

package javanissi;
import java.util.*;

public class UpdateArrayEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("red");
		al.add("white");
		al.add("yellow");
		System.out.println("Before updating");
		System.out.println(al);
		System.out.println("After updating");
		al.set(1,"Nissi");
		System.out.println(al);
	}

}

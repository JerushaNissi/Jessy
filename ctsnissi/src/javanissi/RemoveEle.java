package javanissi;
import java.util.*;

import java.util.ArrayList;

public class RemoveEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("red");
		al.add("white");
		al.add("yellow");
		al.add("black");
		al.add("cyan");
		al.add("grey");
		al.add("pink");
		al.add("violet");
		System.out.println("Before removing");
		System.out.println(al);
		al.remove(3);
		System.out.println("After removing");
		System.out.println(al);
	}

}

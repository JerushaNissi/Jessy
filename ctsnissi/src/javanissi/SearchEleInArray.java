package javanissi;
import java.util.*;

import java.util.ArrayList;

public class SearchEleInArray {

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
		al.add(5);
		System.out.println(al);
		al.contains(5);
		System.out.println(al.contains(5));
		al.contains("white");
		System.out.println(al.contains("white"));
	}

}

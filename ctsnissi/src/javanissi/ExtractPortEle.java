package javanissi;
import java.util.*;

public class ExtractPortEle {

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
		System.out.println("entire arraylist:"+al);
		List li=al.subList(0, 4);
		System.out.println(li);
	}

}

package javanissi;
import java.util.ArrayList;

public class ReplacingString {

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
		String str="God";
		al.set(7, str);
		System.out.println(al);
		int ele=al.size();
		for(int i=0;i<ele;i++)
			System.out.println(al.get(i));
	}

}

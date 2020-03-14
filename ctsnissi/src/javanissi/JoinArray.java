package javanissi;
import java.util.ArrayList;

public class JoinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1 = new ArrayList();
		al1.add("nissi");
		ArrayList al2 = new ArrayList();
		al2.add("jerusha");
		ArrayList join = new ArrayList();
		join.addAll(al1);
		join.addAll(al2);
		System.out.println(join);
		}

}

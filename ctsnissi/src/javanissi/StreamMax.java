package javanissi;

import java.util.ArrayList;

public class StreamMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar =new ArrayList<Integer>();
		ar.add(10);
		ar.add(5);
		ar.add(7);
		ar.add(3);
		Integer x=ar.stream().max((a,b)->a<b ? -1 : 1).get();
		System.out.println(x);
	}

}

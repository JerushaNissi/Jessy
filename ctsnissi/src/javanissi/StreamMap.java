package javanissi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args, Object Function) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(0);
		ar.add(10);
		ar.add(15);
		ar.add(20);
		ar.add(27);
		System.out.println(ar);
		Function<Integer,Integer> f=x->(x*2);
		ar.stream().map(x->(x*2)).forEach(System.out::println);
		List<Integer> list=ar.stream().map(x->(x*2)).collect(Collectors.toList());
		System.out.println(list);
	}

}

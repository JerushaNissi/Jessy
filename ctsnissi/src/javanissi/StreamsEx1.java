package javanissi;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(0);
		ar.add(10);
		ar.add(15);
		ar.add(20);
		ar.add(27);
		System.out.println(ar);
		Predicate<Integer> p=i->(i%5==0);
		//conver ar i.e; collections to stream
		Stream s=ar.stream();
		List<Integer> list=(List<Integer>) s.filter(p).collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> list1=ar.stream().filter(x->(x%2==0)).collect(Collectors.toList());
		System.out.println(list1);
		
		ar.stream().filter(x->(x%2==0)).forEach(System.out::println);
	}

}

	package javanissi;
	import java.util.*;
	import java.util.Arrays;
	import java.util.stream.Stream;

	public class CollectorsExample {

	public static void main(String[] args)
	{
	List<Integer> list1=Arrays.asList(13,5,7,9,11);
	Stream s1=Stream.of(13,5,7,9,11);

	List<Integer> list2=Arrays.asList(3,6,12,9,18,21);
	Stream s2=Stream.of(3,6,12,9,18,21);

	List<Integer> list3=Arrays.asList(5,10,15,20,25);
	Stream s3=Stream.of(5,10.15,20,25);

	Optional<Integer> answer=list1.stream().findAny();
	if(answer.isPresent())
	System.out.println(answer.get());
	else
	System.out.println("no value");

	boolean answer1=list2.stream().allMatch(n->n%3==0);
	System.out.println(answer1);

	boolean answer2=list3.stream().noneMatch(n->n%5==0);
	System.out.println(answer2);


	}

	}



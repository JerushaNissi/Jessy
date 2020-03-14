package javanissi;

import java.util.function.*;

public class BiPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> bip=(a,b)->(a+b)%2==0;
		System.out.println(bip.test(10, 2));
		System.out.println(bip.test(1, 1));
		System.out.println(bip.test(11, 2));
		BiFunction<Integer,Integer,Integer> add=(a,b)->(a+b);
		BiFunction<Integer,Integer,Integer> sub=(a,b)->(a-b);
		BiFunction<Integer,Integer,Integer> mul=(a,b)->(a*b);
		System.out.println(add.apply(10, 2));
		System.out.println(sub.apply(10, 2));
		System.out.println(mul.apply(10, 2));
		
		BiFunction<String,Double,Student> bif=(sname,marks)->new Student(sname,marks);
		
		Student s1=bif.apply("nissi",(double) 97);
		Student s2=bif.apply("jermy",(double) 77);
		Student s3=bif.apply("joel",(double) 27);
		Student s4=bif.apply("johanna",(double) 87);
		Student s5=bif.apply("joy",(double) 67);
		Student s6=bif.apply("jenny",(double) 47);
		Student s7=bif.apply("jessy",(double) 7);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
	}

}

package javanissi;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalInterfaces3Examples {

public static void main(String[] args)
{
//BiPredicate
BiPredicate<Integer,Integer> bip=(a,b)->(a+b)%2==0;

System.out.println(bip.test(10, 2));
System.out.println(bip.test(1, 1));
System.out.println(bip.test(1, 2));

//BiFunction
BiFunction<Integer,Integer,Integer> bifMul =(a,b)->(a*b);
System.out.println("multiplication :"+bifMul.apply(10, 20));

BiFunction<Integer,Integer,Integer> bifAdd =(a,b)->(a+b);
System.out.println("Addition :"+bifAdd.apply(10, 2));

BiFunction<Integer,Integer,Integer> bifSub =(a,b)->(a-b);
System.out.println("Subbtraction:"+bifSub.apply(10, 2));
                                                                             

BiFunction<String,Double,Student> bi =(name,htno)->new Student(name,htno);
Student s1=bi.apply("anuja",(double) 123);
Student s2=bi.apply("dhanekula",(double) 234);
System.out.println(s1);
System.out.println(s2);
//BiConsumer
BiConsumer<String,String> bic=(str1,str2)->System.out.println(str1+str2);
bic.accept("Anuja", "Dhanekula");

}

}
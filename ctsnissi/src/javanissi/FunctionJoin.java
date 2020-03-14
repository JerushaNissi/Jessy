package javanissi;
import java.util.function.*;

public class FunctionJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,String> f1 = str->str.toUpperCase();
		Function<String,String> f2 = str->str.substring(0,9);
		System.out.println(f1.apply("Jerusha nissi"));
		System.out.println(f2.apply("Jerusha nissi"));
		System.out.println(f1.andThen(f2).apply("Jerushanissi"));
		System.out.println(f1.compose(f2).apply("Jermiahnissi"));
	}

}

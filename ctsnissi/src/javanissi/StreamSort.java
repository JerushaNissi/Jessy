package javanissi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1=new product("pen",1,2000);
		product p2=new product("pencil",2,3000);
		product p3=new product("box",1,1000);
		product p4=new product("clip",1,2500);
		ArrayList<product> products =new ArrayList<product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		/*List <product> list =products.stream()
		.sorted((a,b)->a.name.compareTo(b.name))
		.collect(Collectors.toList());
		list.forEach(System.out::println);*/
		product max=products.stream().max((product a,product b)->a.price<b.price ? -1 : 1).get();
		System.out.println(max);
		product min=products.stream().min((product a,product b)->a.price<b.price ? -1 : 1).get();
		System.out.println(min);
	}

}

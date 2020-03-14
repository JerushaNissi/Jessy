package javanissi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p1=new product("Apple",1,20000);
		product p2=new product("sony",2,30000);
		product p3=new product("Mi",1,10000);
		product p4=new product("appo",1,15000);
		product p5=new product("Apple",1,25000);
		product p6=new product("sony",2,31000);
		product p7=new product("Mi",1,13000);
		product p8=new product("appo",1,25000);
		product p9=new product("Apple",1,200000);
		product p11=new product("sony",2,32000);
		product p22=new product("Mi",1,11000);
		product p33=new product("Apple",1,22000);
		product p44=new product("sony",2,33000);
		product p55=new product("appo",1,21500);
		
		ArrayList<product> products =new ArrayList<product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		products.add(p11);	
		products.add(p22);	
		products.add(p33);	
		products.add(p44);
		//List<product> list = products.stream()
		//.filter(p->p.name=="Apple")
		//.collect(Collectors.toList());
		//product list1=products.stream().filter(p->p.name=="Apple").max((product a,product b)->a.price<b.price ? -1 : 1).get();
		//System.out.println(list1);
		//product list2=products.stream().filter(p->p.name.equals("Apple")).sorted((a,b)->a.price.compareTo(b.price)).max((product a,product b)->a.price<b.price ? -1 : 1).get();
		//System.out.println(list2);
	}

}

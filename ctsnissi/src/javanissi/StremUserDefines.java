package javanissi;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class product
{
String name;
int id,price;
@Override
public String toString() {
return "product [name=" + name + ", id=" + id + ", price=" + price + "]";
}
public product(String name, int id, int price) {
super();
this.name = name;
this.id = id;
this.price = price;
}
public List<product> collect(Collector<Object, ?, List<Object>> list) {
	// TODO Auto-generated method stub
	return null;
}

}
public class StremUserDefines {

public static void main(String[] args)
{
product p1=new product("pen",1,2000);
product p2=new product("pencil",2,3000);
product p3=new product("box",1,1000);
product p4=new product("clip",1,2500);
ArrayList<product> products =new ArrayList<product>();
products.add(p1);
products.add(p2);
products.add(p3);
products.add(p4);
List <product> list =products.stream()
.filter(p->p.price<=2000)
.map(p->p)
.collect(Collectors.toList());
long count=products.stream().filter(p->p.price<=2000).count();
System.out.println("Product count::"+count);
list.forEach(System.out::println);

}

}
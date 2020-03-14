package javanissi;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
class stud
{
String id;
String name;
public stud(String eid,String ename)
{
super();
this.id=id;
this.name=name;
}
@Override
public String toString() {
return "stud [id=" + id + ", name=" + name + "]";
}



}
 class Linkedlist {

public static void main(String[] args)
{
LinkedList li1=new LinkedList();


int a[]= {10,20,30,40};

li1.add("java");
li1.add("Dotnet");
li1.add("null");
li1.add(10);
li1.add("oracle");
li1.add("selenium");
System.out.println(li1);

LinkedList li2=new LinkedList();

li2.add("data science");
li2.add("python");
li2.add("big data");

li1.addAll(li2);

System.out.println(li1);
System.out.println(li2);
}

}
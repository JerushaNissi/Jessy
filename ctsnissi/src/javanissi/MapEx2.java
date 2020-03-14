package javanissi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
class Stu
{
String name;
int m1;
int m2;
Stu(String name,int m1,int m2)
{
this.name=name;
this.m1=m1;
this.m2=m2;

}
@Override
public String toString() {
return "Stu [name=" + name + ", m1=" + m1 + ", m2=" + m2 + "]";
}


}
public class MapEx2 {

public static void main(String[] args) {
// TODO Auto-generated method stub
Map<Integer,Stu> hm =new HashMap<Integer,Stu>();
Stu s1=new Stu("sunny",50,20);
Stu s2=new Stu("bunny",20,50);
Stu s3=new Stu("chinny",60,19);
Stu s4=new Stu("zimmy",8,70);
hm.put(1001,s1);
hm.put(1002,s2);
hm.put(1003,s3);
hm.put(1003,s4);
System.out.println(hm);
Set entries=hm.entrySet();

Iterator itr1=entries.iterator();
while(itr1.hasNext())
{
Map.Entry me=(Map.Entry)itr1.next();
Stu s = (Stu)me.getValue();
	if(s.m2<=40) 
	{
		System.out.println(me.getKey()+"  "+s.name);
	}

}
}

}
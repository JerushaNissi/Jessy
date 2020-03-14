
import java.util.*;
import java.util.Map.Entry;

class Employee implements Comparable<Employee> {

   private int id;
   private int marks;
@Override
public String toString() {
return "Employee [id=" + id + ", marks=" + marks + "]";
}
@Override
public int compareTo(Employee arg0) {

return 0;
}



}  
public class Marks {

public static void main(String[] args) {

Map<Integer, Integer> hm = new HashMap<>();
Scanner sc=new Scanner(System.in);
int i;
System.out.println("enter n value :: ");
int n=sc.nextInt();

System.out.println("enter key and value");
System.out.println("--------------------------");
for(i=1;i<=n;i++)
{
System.out.println("enter id and marks::"+ i);
int id=sc.nextInt();//System.out.println("enter Marks");
hm.put(id,sc.nextInt());;
}
Set set = hm.entrySet();
       Iterator iterator = set.iterator();
       
       while(iterator.hasNext())
       {
            Entry me = (Entry) iterator.next();
            System.out.print(me.getKey() + "::"+ me.getValue());
            //System.out.println(me.getValue());
            Collections.sort((List<Integer>)me);
       }
     
}

}

//public class  {

//}
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class ArrayListMarks {
 
       public static void main(String[] args) {
              ArrayList<Students>list=new ArrayList<Students>();
              Students s1=new Students("Vijeta",80);
              Students s2=new Students("Adarsh",78);
              Students s3=new Students("Virat",90);
              Students s4=new Students("Kavya",20);
              list.add(s1);
              list.add(s2);
              list.add(s3);
              list.add(s4);
              System.out.println("students who are passed:");
       Predicate<Students>p=s->s.marks>=40;
       Function<Students,String>f=stu->{
              int m=stu.marks;
              if(m>=80)
                     return "Distinction";
              else if(m>=60 && m<=79)
                     return "First Class";
              else if(m>=40 && m<=50)
                     return "Second class";
              else
                     return "fail";
       };
       Consumer<Students>c=s->{
             
              System.out.print(s.name+"  ");
              System.out.println(f.apply(s));
       };
       for(Students s:list) {
              if(p.test(s))
              {
                     c.accept(s);
              }
                    
       }
       }
 
}
class Students {
       String name;
       int marks;
       Students(String name,int marks){
              this.name=name;
              this.marks=marks;
       }
 
}


package javanissi;
import java.util.*;

 class Student2 implements Comparable<Student2>{
	String htno;
	String name;
	Student2(String htno, String name) {
		super();
		this.htno = htno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student2 student) {
		// TODO Auto-generated method stub//in which of the students fiels it has to be overriden
		if(name.compareTo(student.name)<0)
			return -1;
		else if(name.compareTo(student.name)>0)
			return 1;
		else
			return 0;
	}
 }	
 /*class Employee1{
	String eid;
	String enmae;
	Employee1(String eid, String enmae) {
		super();
		this.eid = eid;
		this.enmae = enmae;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", enmae=" + enmae + "]";
	}
	
}*/
	


public class UserDefArrayCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2("127","Nissi");
		Student2 s2=new Student2("124","missi");
		Student2 s3=new Student2("125","lissi");
		ArrayList<Student2> al1=new ArrayList();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		for(Student2 s :al1)
			System.out.println(s);
		Collections.sort(al1);
		System.out.println("sorted elements "+al1);
		Collections.reverse(al1);
		System.out.println("reverse sorted elements "+al1);
		al1.forEach(System.out::println);
		//System.out.println(al1);
		/*Iterator itr = al1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		al1.forEach(System.out::println);
		
		for(Student2 s :al1)
			System.out.println(al1);
		}
		
		Employee1 e1=new Employee1("97","jessy");
		Employee1 e2=new Employee1("87","messy");
		Employee1 e3=new Employee1("77","lessy");
		ArrayList al2=new ArrayList();
		al2.add(e1);
		al2.add(e2);
		al2.add(e3);
		System.out.println(al2);*/
	}
}



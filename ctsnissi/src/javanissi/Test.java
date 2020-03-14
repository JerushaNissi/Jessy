package javanissi;
import java.util.ArrayList;
import java.util.function.*;

class Student1{
	String name;
	int marks;
	public Student1(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> list =new ArrayList<Student1>();
		Student1 s1=new Student1("nissi",97);
		Student1 s2=new Student1("jermy",77);
		Student1 s3=new Student1("joel",27);
		Student1 s4=new Student1("johanna",87);
		Student1 s5=new Student1("joy",67);
		Student1 s6=new Student1("jenny",47);
		Student1 s7=new Student1("jessy",7);
		//inorder to get the objects as group we are using arraylist
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		
		Predicate<Student1> p=s->s.marks>=60;//condition
		System.out.println(p.test(s1));
		
		Function<Student1,String> fun=ss->//testing
		{
			if(ss.marks>=70)
				return "\'A\' grade";
			else if(ss.marks>=50)
				return "\'B\' grade";
			else if(ss.marks>=40)
				return "\'C\' grade";
			else if(ss.marks>=30)
				return "\'D\' grade";
			else
				return "Fail";
		};
		System.out.println(fun.apply(s1));
		
		Consumer<Student1> cs=s->{//display values
			System.out.println("Student name:"+s.name);
			System.out.println("Student marks:"+s.marks);
			System.out.println("Student Grade:"+fun.apply(s));
		};
		if(p.test(s3))
			cs.accept(s3);
		else
			System.out.println("Student failed");
		
		for(Student1 x:list)
		{
			if(p.test(x))
				cs.accept(x);
		else
			System.out.println("Student failed");
	}

}
}

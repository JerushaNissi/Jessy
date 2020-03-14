package javanissi;

import java.util.ArrayList;
import java.util.function.Function;

class Student implements Comparable<Student>
{
	String sname;
	double marks;
	public Student(String sname, double marks2) 
	{
		super();
		this.sname = sname;
		this.marks = marks2;
	}
	//public void Student1(String sname2, String marks2) {
		// TODO Auto-generated constructor stub
	//}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student student) {
		if(sname.compareTo(student.sname)<0)
			return -1;
		else if(sname.compareTo(student.sname)>0)
			return 1;
		else
			return 0;
	}
}
public class StudentExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("nissi",97);
		Student s2=new Student("jermy",77);
		Student s3=new Student("joel",27);
		Student s4=new Student("johanna",87);
		Student s5=new Student("joy",67);
		Student s6=new Student("jenny",47);
		Student s7=new Student("jessy",7);
		
		//Function<Student,String> f1= ss1-> ss1.sname.equals("jessy");
		Function<Student,String> fun=ss->
		{
			if(ss.marks>70)
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
		
		ArrayList<Student> list =new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		
		if(s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("NOT Equal");
		
		System.out.println("Details of the students");
		System.out.println(s1);
		System.out.println(s2);
	}

}

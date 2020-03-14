package javanissi;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String empname;
	String empdesg;
	Float empsal;
	String empcity;
	public Employee(String empname,String empdesg,Float empsal,String empcity) {
		this.empname=empname;
		this.empdesg=empdesg;
		this.empsal=empsal;
		this.empcity=empcity;
	}
	
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empdesg=" + empdesg + ", empsal=" + empsal + ", empcity=" + empcity
				+ "]";
	}

	public boolean equals(Object obj)//in any case we have to override equals method
	{
		Employee e=(Employee)obj;//obj is typecaste to emp object
		
		if(empname.equals(e.empname)&&empdesg.equals(e.empdesg)&&empsal.equals(e.empsal)&&empcity.equals(e.empcity))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Nissi","manager",35000f,"Vijayawada");
		Employee emp2=new Employee("Neeru","ceo",45000f,"Vizag");
		Employee emp3=new Employee("Neelu","clerk",2000f,"mumbai");
		Employee emp4=new Employee("Nirmala","Desk officer",25000f,"Vijayawada");
		Employee emp5=new Employee("Niranjani","emp",40000f,"Vijayawada");
		
		Predicate<Employee> p1 = emp -> emp.empdesg.equals("Manager");
		Predicate<Employee> p2 = emp -> emp.empcity.equals("Vijayawada");
		Predicate<Employee> p3 = emp -> emp.empsal<30000f;
		
		ArrayList<Employee> list =new ArrayList<Employee>();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		display(p2.and(p3),list);//emp whose city is vijayawada and salary greater than 30000
		
		if(emp1.equals(emp2))
			System.out.println("Equal");
		else
			System.out.println("NOT Equal");
		//System.out.println(emp1);
		//System.out.println(emp2);
	}
	public static void display(Predicate<Employee> p,ArrayList<Employee> list)
	{
		for(Employee emp:list)
		{
			if(p.test(emp))
			{
				System.out.println(emp);
			}
		}
	}
}
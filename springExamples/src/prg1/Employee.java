package prg1;

public class Employee {
	String company;
	String empid;
	String name;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [company=" + company + ", empid=" + empid + ", name=" + name + "]";
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("details");
		System.out.println(company);
		System.out.println(empid);
		System.out.println(name);
	}	
}

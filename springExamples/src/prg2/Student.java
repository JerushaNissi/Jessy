package prg2;

public class Student {
	String roll;
	String name;
	String branch;
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void showStudents() {
		System.out.println("The details of students are::");
		System.out.println(roll);
		System.out.println(name);
		System.out.println(branch);
	}

}

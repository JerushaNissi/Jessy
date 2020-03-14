package prg2;

public class Person {
	String name;
	String age;
	Address address;
	public Person(String name, String age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void showDetails() {
		System.out.println(name+" "+age);
		System.out.println(address.toString());
	}
}

package prg2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-bean.xml");
		/*Student s=(Student) ctx.getBean("stu");
		s.setRoll("J97");
		s.setName("Jessy");
		s.setBranch("cse");
		s.showStudents();
		
		Student s1=(Student) ctx.getBean("stu");
		s1.showStudents();*/
		
		Person p=(Person)ctx.getBean("per");
		p.showDetails();
	}
}

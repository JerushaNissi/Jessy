package prg1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestMainSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.by using bean factory..it has only one implementation class..
		 * classPathResource
		
		ClassPathResource cpr= new ClassPathResource("spring-bean.xml");
		XmlBeanFactory xbean=new XmlBeanFactory(cpr);
		
		ClassPathResource cpr1= new ClassPathResource("spring-bean.xml");
		BeanFactory bf=new XmlBeanFactory(cpr1);*/
		
		/*2.by using application context..it has 3 implementation classs..
		 * classPathXmlAppContext
		 * FileSystemApplicationContext
		 * webXmlApplicationContext*/
		
		/*HelloWorld obj=(HelloWorld) ctx.getBean("helloWorld");
		obj.getMessage();
		obj.display();
		
		Employee e=(Employee)ctx.getBean("emp");
		e.display();*/
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Question.xml");
		
		Employee e=(Employee)ctx.getBean("derivedEmp");
		e.display();
	}

}

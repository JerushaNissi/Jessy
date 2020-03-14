package prg3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMain {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Question.xml");
		
		SetterEx setter=(SetterEx)ctx.getBean("setex");
		setter.display();
		
		SetterEx setter1=(SetterEx)ctx.getBean("setex1");
		setter1.display();
	}

}

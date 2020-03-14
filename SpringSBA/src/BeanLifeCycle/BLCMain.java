package BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BLCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("Main.xml");
		 BeanLifeCycle blc = (BeanLifeCycle) ctx.getBean("beanlifecycle");

         blc.getMessage();
	}

}

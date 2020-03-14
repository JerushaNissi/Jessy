package prg3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Qmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Question.xml");
		QuestionBank qb=(QuestionBank) ctx.getBean("q1");
		qb.showAnswers();
		
		QBMap qbm=(QBMap)ctx.getBean("qm");
		qbm.showAnswers();
	}
}

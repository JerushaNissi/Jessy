package Main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import StuDAO.StudentsDAO;
import StuDAO.StudentsDAOImpl;
import StuData.Students;

public class StudentsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Students.xml");
		StudentsDAOImpl sdao=(StudentsDAOImpl) ctx.getBean("stdao");
		
		Students st=new Students();
		
		List<Students> students =sdao.getStudents(); 
		Iterator<Students> itr=students.iterator();
		for(Students s:students)
		{
			System.out.println(s.getSname()+" "+s.getSid()+" " +s.getSage());
		}
	
		sdao.getStudents();

	}

}

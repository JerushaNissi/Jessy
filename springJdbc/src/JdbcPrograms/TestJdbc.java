package JdbcPrograms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Jdbc.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
		Employee emp =new Employee();
		
		  int status=dao.insertEmployee(new Employee());  
			 System.out.println("success...:)"+status); 
		 
		
		 
		 /*
		  * 
		  emp.setEmpid("897");
		 int temp1=dao.deleteEmployee(emp);
		 System.out.println("success...:)"+temp1);
		 
		 ("Nerusha","Ad-java","Senior trainer","Nessy@gmail.com","167")
		 
		 int temp=dao.updateEmployee(new Employee());  
		 System.out.println("success...:)"+temp);  
		  
		 */
	}

}

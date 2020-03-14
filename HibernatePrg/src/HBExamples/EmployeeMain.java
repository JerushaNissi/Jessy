package HBExamples;
import org.hibernate.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("/hibernate.cfg.xml").build();  
    //Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();    
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session1= factory.openSession();  
    Session session2 = factory.openSession(); 
    Session session3 = factory.openSession(); 
    
    Transaction t1 = session1.beginTransaction();  
    Transaction t2 = session2.beginTransaction(); 
    Transaction t3 = session3.beginTransaction(); 
      
     Employee emp1=new Employee();
     emp1.setEmpid("19Aj97");
     emp1.setEname("Johanna Jessy");
     emp1.setDept("Computers");
     emp1.setDesg("Trainee");
     emp1.setEmail("jona@gmail.com");
     
     Employee emp2=new Employee();
     emp2.setEmpid("19Aj77");
     emp2.setEname("Jermiah Nissi");
     emp2.setDept("Aero");
     emp2.setDesg("Trainee");
     emp2.setEmail("jermy@gmail.com");
     
     Employee emp3=new Employee();  
     emp3.setEmpid("19Aj67");
     emp3.setEname("Jerooha Nissi");
     emp3.setDept("Computers");
     emp3.setDesg("Trainee");
     emp3.setEmail("jooha@gmail.com");
     
     //inserting values into employee
     session1.save(emp1); 
     session2.save(emp2); 
     session3.save(emp3); 
     //save the deatils as commit
     t1.commit();  
     t2.commit();
    // t3.commit();
     t3.rollback();
    //doesnot save the data
     System.out.println("successfully saved");   
     
     factory.close();  
     session1.close(); 
     session2.close();   
     session3.close();   
	}

}

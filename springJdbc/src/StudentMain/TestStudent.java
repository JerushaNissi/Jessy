package StudentMain;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.StudentDAOImpl;
import Data.Student;

public class TestStudent {
	
	public static void main(String[] args) {
		boolean result=false;
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Student.xml");
		
		StudentDAOImpl sdi=(StudentDAOImpl) ctx.getBean("sdao");
		int choice=0;
		do {
		System.out.println("~~~~~~~~~~~~~~~WELCOME~~~~~~~~~~~~~~");
		System.out.println("Operations on Student DataBase");
		System.out.println("Selct one of the following to proceed...!");
		System.out.println("MENU\n1.Insertion by PST\n2.Normal Insertion\n3.Update student details\n4.Delete from Student by Id\n5.Delete from student by student object\n6.Displaying\n7.Quit");
		switch(choice) {
		case 1:
			
				//Enter the student details
				System.out.println("Enter student id:");
				int id=sc.nextInt();
				System.out.println("Enter student First Name::");
				String fname=sc.next();
				System.out.println("Enter Student LAst Name::");
				String lname=sc.next();
				System.out.println("Enter Student Age::");
				int age=sc.nextInt();
		
				//create the student object and set the values in it
				Student st1=new Student();
				st1.setId(id);
				st1.setFirst_Name(fname);
				st1.setLast_Name(lname);
				st1.setAge(age);
		
				//call the create method to insert values in the table
				sdi.create(st1);
		
		//List<Student> st1=sdi.getStudent();
		
		/*//deleting a row using student object
		System.out.println("Enter student id:");
		int id1=sc.nextInt();
		st.setId(id1);
		sdi.delete(st);
		
		//deleting a student by id
		System.out.println("Enter student id:");
		int id1=sc.nextInt();
		sdi.delete(id1);
	*/	
		//updating a student entry by student object
		//sdi.update(st);
		
		//inserting by prepared statement
		//sdi.insertStudentByPST(st);
		System.out.println("Successfull");
		
		}
	}while( choice!=0);
  }
}

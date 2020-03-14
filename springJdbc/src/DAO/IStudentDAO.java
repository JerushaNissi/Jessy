package DAO;


import java.util.List;

import Data.Student;

public interface IStudentDAO {
		
		public void create(Student student);
		//insert the data into table
		/*
		* this method is used to list down a record from the student table corresponding to student id*/
		
		public Student getStudent(int id);

		public List<Student> getStudent();

		public void delete(int id);
		
		//public void delete(Student student);

		public void update(Student student);
		
		public boolean insertStudentByPST(final Student pst);
}

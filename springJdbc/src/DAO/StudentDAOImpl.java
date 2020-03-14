package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import Data.Student;

public class StudentDAOImpl implements IStudentDAO{
	
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	} 
	
	
	//inserting
	@Override
	public boolean insertStudentByPST(Student pst) 
	{
		// TODO Auto-generated method stub
		String query ="insert into Student values(?,?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>()
		{  
			//call back method will retrive the value
		    @Override  
		    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException,DataAccessException 
		    {  	              
		        ps.setInt(1,pst.getId());  
		        ps.setString(2,pst.getFirst_Name());  
		        ps.setString(3,pst.getLast_Name());  
		        ps.setInt(4,pst.getAge());    
		        return ps.execute();
		    }
	});
	}
	
	@Override
	public void create(Student student) {
		// TODO Auto-generated method stub
		 String sql="insert into student values('"+student.getId()+"','"+student.getFirst_Name()+"','"+student.getLast_Name()+"','"+student.getAge()+"')";
		 int result=jdbcTemplate.update(sql);
		 System.out.println("Record Inserted SuccessuFully...."+result);
		
	}
	
	
	//display result
	
	public List<Student> getStudent() {
		String sql="select * from student";
		List<Student> lists=jdbcTemplate.query(sql,new RowMapper<Student>(){
		@Override
		public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
		Student stu=new Student();
		stu.setId(rs.getInt("id"));
		stu.setFirst_Name(rs.getString("fname"));
		stu.setLast_Name(rs.getString("lname"));
		stu.setAge(rs.getInt("age"));
		return stu;
		}
		});
		return lists;
		}

	//updating
	
	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		String query="update student set First_Name='"+student.getFirst_Name()+"',Last_Name='"+student.getLast_Name()+"',Age='"+student.getAge()+"'where id='"+student.getId()+"' ";
		int result= jdbcTemplate.update(query);
		System.out.println("Record Updated SuccessuFully...."+result);
	}
	
	
	//deleting
	
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		 String sql1="delete from student where id='"+id+"' ";
		 int result=jdbcTemplate.update(sql1);
		 System.out.println("Record deleted SuccessuFully...."+result);
	}
	
	
	// inserting by prepared statement
	
	/*@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		String sql1="delete from student where id='"+student.getId()+"' ";
		int result=jdbcTemplate.update(sql1);
		System.out.println("Record Deleted SuccessuFully...."+result);
	}*/
	
	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

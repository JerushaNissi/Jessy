package JdbcPrograms;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;  

public class EmployeeDao {  
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int insertEmployee(Employee e){  
    //String query="insert into employee values('"+e.getEmpid()+"','"+e.getEname()+"','"+e.getDesg()+"','"+e.getDept()+"','"+e.getEmail()+"')";
	String query ="insert into Employee values(?,?,?,?,?)";
	jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		//call back method will retrive the value
	    @Override  
	    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException {  	              
	        ps.setString(1,e.getEmpid());  
	        ps.setString(2,e.getEname());  
	        ps.setString(3,e.getDesg());  
	        ps.setString(4,e.getDept());  
	        ps.setString(5,e.getEmail());  

	        return ps.execute();  	              
	    } 
	});
    return jdbcTemplate.update(query);  
}
/*
public int updateEmployee(Employee e){  
    
	// String query="update employee set ename='"+e.getEname()+"',desg='"+e.getDesg()+"',dept='"+e.getDept()+"',email='"+e.getEmail()+"' where empid='"+e.getEmpid()+"' "; 
	String query="update employee set ename = 'Jermiah', desg ='traine', dept='Aero', email='jermi@gmail.com' where empid='197' ";
    return jdbcTemplate.update(query);  
}  
public int deleteEmployee(Employee e){  
    String query="delete from employee where empid='"+e.getEmpid()+"' ";  
    return jdbcTemplate.update(query);  
} 
*/
}  
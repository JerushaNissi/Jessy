package dao;
import model.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class EmployeeDAO{
	//connection to database
	public static Connection getConnection(){
		Connection con=null;
		try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nissi","root","root");
			}
		catch(Exception e){
				System.out.println(e);
		}
		return con;
	}
	//Inserting 
	public int insertEmployee(Employee emp){
		int result=0;
		try
		{
		Connection con=getConnection();

		String sql="insert into employee values(?,?,?,?,?,?)";

		PreparedStatement pst=con.prepareStatement(sql);

		pst.setString(1, emp.getEmpid());
		pst.setString(2, emp.getEname());
		pst.setString(3, emp.getDept());
		pst.setString(4, emp.getDesg());
		pst.setString(6, emp.getEmail());

		result=pst.executeUpdate();

		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		return result;
	}
	
	//Displaying the details..display servlet
	public List<Employee> showEmployees(){
		List<Employee> list= new ArrayList<Employee>();
		try{
				Connection con=getConnection();
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from employee");
				while(rs.next()){
						Employee emp =new Employee ();
						emp.setEmpid(rs.getString(1));
						emp.setEname(rs.getString(2));
						emp.setDept(rs.getString(3));
						emp.setDesg(rs.getString(4));
						emp.setEmail(rs.getString(5));
						list.add(emp);
				}
		}catch(Exception e){
				System.out.println(e);
			}
		return list;
	}
	
	public Employee searchEmployee(String id)
	{
	try
	{
	Connection con=getConnection();
	String sql="select * from employee where empid=?";
	PreparedStatement pst=con.prepareStatement(sql);
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	return null;

	}
}
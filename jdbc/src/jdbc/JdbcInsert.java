package jdbc;
import java.sql.*;
public class JdbcInsert {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/nissi","root","root");
		Statement statement=connection.createStatement();
		//String query="Insert into students values"+ "(1,'nissi','cse')";
		String query1="update students set htno=7 where branch='nissi' " ;
		String query2="create table Stu(name String,branch String,roll String,id Int)";
		int count= statement.executeUpdate(query2);
		boolean flag=statement.execute(query1);
		if(flag)
		System.out.println("ResultSet is returned");
		else
		System.out.println("record inserted");
		System.out.println(count+"Records inserted");
		statement.close();
		connection.close();
	}

}

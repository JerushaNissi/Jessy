package jdbc;
import java.sql.*;
import java.util.Scanner;
public class JdbcCreate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/nissi","root","root");
		Statement statement=connection.createStatement();
		
		
		String query="insert into employee values('vijeta','844434','dev','Pat','cogniznt','vj@cog.com')" ;
		statement.executeUpdate(query);
		System.out.println("inserted data..");
		
		
		
		
		statement.close();
		connection.close();
	}

}

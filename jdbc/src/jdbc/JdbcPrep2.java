package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcPrep2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/nissi","root","root");
		
		Statement statement=connection.createStatement();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stu id: ");
		int id=sc.nextInt();
		
		String query ="select * from stu where id="+id;
		
		PreparedStatement ps=connection.prepareStatement(query);
		
		ResultSet rs = statement.executeQuery(query);
		
		if(rs.next())
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
	
		boolean flag=statement.execute(query);
		if(flag)
		System.out.println("ResultSet found");
		else
		System.out.println("Not found");
		
		}	catch(Exception e){
			System.out.println(e);
		}
		
	}

}

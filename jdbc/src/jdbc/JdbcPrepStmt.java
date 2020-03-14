package jdbc;
import java.sql.*;
import java.util.Scanner;
public class JdbcPrepStmt {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/nissi","root","root");
		Statement statement=connection.createStatement();
		String query ="insert into stu values(?,?,?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stu name: ");
		String name=sc.nextLine();
		System.out.println("Enter stu branch: ");
		String branch=sc.nextLine();
		System.out.println("Enter stu roll: ");
		String roll=sc.nextLine();
		System.out.println("Enter stu id: ");
		int id=sc.nextInt();
		ps.setString(1,name);
		ps.setString(2,branch);
		ps.setString(3,roll);
		ps.setInt(4,id);
		System.out.println(ps.executeUpdate());
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

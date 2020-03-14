package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample
{

public static void main(String[] args) throws ClassNotFoundException,SQLException
{
//Class.forName("com.mysql.cj.jdbc.Driver");

DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");

Statement stmt=con.createStatement();

String query="insert into employee values ('Anuja','844334','java','PAT','CTS','anuja@gmail.com')";

stmt.executeUpdate(query);

System.out.println("inserted data into Employee TABLE...");

stmt.close();
con.close();

}

}


package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountsDao
{
	private static String jdbcURL;
	private static String jdbcUsername;
	private static String jdbcPassword;
	private static Connection jdbcConnection;
 
	public AccountsDao(String jdbcURL, String jdbcUsername, String jdbcPassword) 
	{
    this.jdbcURL = jdbcURL;
    this.jdbcUsername = jdbcUsername;
    this.jdbcPassword = jdbcPassword;
	}
 
	public static void connect() throws SQLException
	{
    if (jdbcConnection == null || jdbcConnection.isClosed())
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException(e);
        }
        jdbcConnection = DriverManager.getConnection(
                                    jdbcURL, jdbcUsername, jdbcPassword);
    }
	}
 
	public void disconnect() throws SQLException 
	{
    if (jdbcConnection != null && !jdbcConnection.isClosed()) {
        jdbcConnection.close();
    }
	}
	public static void withdraw(String acntnum,float amount) throws SQLException {
		connect();
		String sql="update accounts set balance=balance- ? where acntnum= ?";
		PreparedStatement pst=jdbcConnection.prepareStatement(sql);
		pst.setString(1, acntnum);
		pst.setFloat(2, amount);
		int status=pst.executeUpdate(sql);
		System.out.println("Amount updated");
	}
	public static void deposit(String acntnum,float amount) throws SQLException {
		  connect();
		  String sql="update accounts set balance=balance+amount where acntNum=?";
		  PreparedStatement pst=jdbcConnection.prepareStatement(sql);
		  pst.setString(1, acntnum);
		  pst.setFloat(2, amount);
	      int status=pst.executeUpdate(sql);
	      System.out.println("amount Deposited");
	}
	public static void getBalance(String acntnum) throws SQLException {
		 connect();
		 String sql="select amount from accounts where acntnum=?";
		 PreparedStatement pst=jdbcConnection.prepareStatement(sql);
		 pst.setString(1, acntnum);
		 ResultSet status=pst.executeQuery(sql);
		 System.out.println("amount Deposited");
		 
		 status.close();
	}
	  
}



package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {
	
	public static Connection establishConnection() throws SQLException ,ClassNotFoundException, IOException
	{
		Connection con=null;
		FileInputStream fis=new FileInputStream("D:\\db.properties.txt");
		Properties properties=new Properties();
		properties.load(fis);
		try {
				String dname=(String) properties.get("dname");
				String url=(String) properties.get("url");
				String username=(String)properties.get("uname");
				String password=(String)properties.get("pwd");
				Class.forName(dname);
				con=DriverManager.getConnection(url,username,password);
			}
		catch(SQLException e)
		{

		}
	return con;
	}

}

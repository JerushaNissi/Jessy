package jdbc;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;
public class RBFConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\files\\db.properties.txt");
			Properties p=new Properties();
			p.load(fis);
			String dname=(String)p.get("Dname");
			String url=(String)p.get("URL");
			String username=(String)p.get("Uname");
			String password=(String)p.get("pwd");
			
			String tablename1=(String)p.get("tablename");
			Scanner sc =new Scanner(System.in);
			System.out.println("Print table name...!");
			String tablename=sc.next();
			
			Class.forName(dname);
			System.out.println("Drivers Loaded");
			Connection connection=DriverManager.getConnection(url,username,password);
			System.out.println("Connection created");
			
			//executing query
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from"+tablename);
			ResultSetMetaData rsmd=rs.getMetaData();
			//printing col names
			System.out.println("------------------------------------------");
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.println(rsmd.getColumnName(i));
			}
			System.out.println(" ");
			System.out.println("------------------------------------------");
			//printing the data
			while(rs.next())
			{
				for(int j=1;j<=rsmd.getColumnCount();j++)
				{
					System.out.println(rs.getString(j)+" ");
				}
				System.out.println(" ");
			}
			//rs.close();
			//statement.close();
			connection.close();
			}catch(Exception e) {
				System.out.println(e);
			}
	}

}

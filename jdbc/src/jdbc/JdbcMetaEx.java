package jdbc;
import java.sql.*;

public class JdbcMetaEx {

public static void main(String[] args) throws ClassNotFoundException,SQLException {
// TODO Auto-generated method stub
      try {
      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
  System.out.println("Drivers loaded...");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nissi","root","root");
  System.out.println("Connection established..");
  DatabaseMetaData dmd=con.getMetaData();
  System.out.println("DB name :"+dmd.getDatabaseProductName());
  System.out.println("DB version :"+dmd.getDatabaseProductVersion());
  System.out.println("name of driver :"+dmd.getDriverName());
  System.out.println("version of driver:"+dmd.getDriverVersion());
  System.out.println("Major version of driver:"+dmd.getDriverMajorVersion());
  System.out.println("minor version of driver :"+dmd.getDriverMinorVersion());

         //user db details
  Statement st=con.createStatement();
  ResultSet rs=st.executeQuery("select * from emp");
  ResultSetMetaData rsmd=rs.getMetaData();
   //own code
  while(rs.next())
   {
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
   }
      }
      catch(SQLException e)
      {
      System.out.println(e);
      }
}

}
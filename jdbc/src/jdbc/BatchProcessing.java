package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Drivers loaded");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nissi","root","root");
System.out.println("connection established");
con.setAutoCommit(false);
Statement st=con.createStatement();
st.addBatch("insert into stu values('john','it','j83',6)");
st.addBatch("delete from stu where id=6");
st.addBatch("update stu set name='joel' where id=17");
int res []=st.executeBatch();
for(int i=0;i<res.length;i++)
{
System.out.println("no of rows effeccted "+res[i]);
}
con.commit();
con.rollback();
con.close();
}
}

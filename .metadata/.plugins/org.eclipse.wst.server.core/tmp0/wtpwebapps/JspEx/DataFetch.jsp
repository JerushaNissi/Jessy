<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String ID=request.getParameter("id");

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nissi","root","root");
String query="select * from student where id=?";
PreparedStatement pst=con.prepareStatement(query);
pst.setString(1,ID);
ResultSet rs=pst.executeQuery();
if(rs.next())  
{
out.println("<html><body>");
out.print("<form action='FinalUpdate.jsp'>");

  out.print("Student-id:<input type='text' name='id' value='"+rs.getString(1)+"'>");
 
  out.print("<br>Student-name:<input type='text' name='name' value='"+rs.getString(2)+"'>");
 
  out.print("<br>Student-dept:<input type='text' name='dept' value='"+rs.getString(3)+"'>");
 
  out.print("<br>Student-desig:<input type='text' name='desig' value='"+rs.getString(4)+"'>");
 
  out.print("<br>Student-cmpny:<input type='text' name='cmpny' value='"+rs.getString(5)+"'>");
 
  out.print("<br>Student-email:<input type='text' name='email' value='"+rs.getString(6)+"'>");
 
  out.print("<br><input type='submit' name='submit' value='Update'>");

out.print("</form>");
out.println("</html></body>");

}
else
{
System.out.println("InValid User-ID");
}


pst.close();
con.close();
%>

</body>
</html>
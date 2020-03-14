<	%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*" %>
    <%@ page import="javax.servlet.http.*,javax.servlet.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost/nissi" user="root" password="root"/>
		
		<sql:query dataSource="${db}" var="rs">
			SELECT * from Student;
		</sql:query>
		
		<sql:update dataSource="${db}" var="count">
		INSERT INTO Student VALUES (154, 'jerusha', 'nissi', 21);
		</sql:update>
			
		<c:set var="StudentId" value="<%=request.getParameter(\"id\") %>"/>
		<sql:update dataSource="${db}" var="count1">
		DELETE from Student where id=?
		<sql:param value="${StudentId}"/>
		</sql:update>
		
		<sql:update dataSource="${db}" var="count2">
            INSERT INTO Student
                           (id,First_Name,Last_Name,Age) VALUES (?, ?, ?, ?)
            <sql:param value="${param.id}" />
            <sql:param value="${param.FirstName}" />
            <sql:param value="${param.LastName}" />
            <sql:param value="${param.Age}" />
        </sql:update> 
		
		
		<table border="2" width="100%">  
		<tr>  
		<th>Student ID</th>  
		<th>First Name</th>  
		<th>Last Name</th>  
		<th>Age</th>  
		</tr>
		  
		<c:forEach var="table" items="${rs.rows}">  
		<tr>  
		<td><c:out value="${table.id}"/></td>  
		<td><c:out value="${table.First_Name}"/></td>  
		<td><c:out value="${table.Last_Name}"/></td>  
		<td><c:out value="${table.Age}"/></td>  
		</tr>  
		</c:forEach>  
		</table>  
</body>
</html>
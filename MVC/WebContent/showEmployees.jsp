<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1" import="java.util.*,model.Employee"%>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>showEmployees.jsp</title>
</head>
<body>

<h2>Here Data Will be Displayed.............</h2>

<h4>Employee Information...</h4>

<table border="1" width="60%">
<tr><th>Employee Id</th></tr>
<tr><th>Employee Name</th></tr>
<tr><th>Employee Department</th></tr>
<tr><th>Employee Designation</th></tr>
<tr><th>Employee Email</th></tr>

<%
List<Employee> list=(List<Employee>)request.getAttribute("list");
%>
<c:set var="list1" value="${list}"/>
<c:foreach items="${list}" var="emp">
<tr><td>${emp.getEmpid()}</td></tr>
<tr><td>${emp.getEname()}</td></tr>
<tr><td>${emp.getDept()}</td></tr>
<tr><td>${emp.getDesg()}</td></tr>
<tr><td>${emp.getEmail()}</td></tr>
</c:foreach>
</table>

</body>
</html>
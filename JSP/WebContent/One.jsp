<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try
	{
	float price;
	String name=request.getParameter("name");
	int age=Integer.parseInt(request.getParameter("age"));
	if(age>62)
	{
    	 price=7.00f;
	}
	else if(age<10)
	{
    	 price=5.00f;
	}
	else
	{
    	 price=9.50f;
	}
		request.setAttribute("name",name);
		request.setAttribute("age",age);
		request.setAttribute("price",price);
		ServletContext ctx=this.getServletContext();
		RequestDispatcher rd=ctx.getRequestDispatcher("/Two.jsp");
		rd.forward(request, response);
	}
	catch(Exception e)
	{
     	out.println(e);
	}

%>

</body>
</html>
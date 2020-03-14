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
String id=request.getParameter("userid");
String pass=request.getParameter("pass");

out.println("Welcome"+ id);

session.setAttribute("UserId",id);
session.setAttribute("Password",pass);
%>
<a href="sessionOutput.jsp">CLICK HERE</a>

</body>
</html>
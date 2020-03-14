<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*" %>
    <%@ page import="javax.servlet.http.*,javax.servlet.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost/cts"
	user="root" password="root"/>
	
	<!--<sql:query dataSource="${db }" var="rs">
	SELECT * FROM users;
	</sql:query>-->
	
	<c:set var="Users" value="<%=request.getParameter(\"admin\") %>"/>
	<c:set var="Users1" value="<%=request.getParameter(\"passwd\") %>"/>
	
	<sql:update dataSource="${db }" var="count">
	insert into users values(?,?);
	<sql:param value="${Users}"></sql:param> 
	<sql:param value="${Users1}"></sql:param> 
	
	
	</sql:update>
	
	
	
	<sql:query dataSource="${db }" var="rs">
	SELECT * FROM users;
	</sql:query>
	
	<table border="2" width="100%">
	<tr>
	<th>uname</th>
	<th>passwd</th>
	
	</tr>
	
	<c:forEach var="table" items="${rs.rows }">
	<tr>
	<td><c:out value="${table.uname}"/></td>
	<td><c:out value="${table.passwd}"/></td>
	
	</tr>
	</c:forEach>
	</table>
</body>
</html>
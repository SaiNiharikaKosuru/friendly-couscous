<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="String" value="JSTL Programming"/>

<c:if test="${fn:contains(String,'programming') }">
<p>Found Programming string</p>
</c:if>

<b>After contains Tag</b>

<c:if test="${fn:contains(String,'programming') }">
<p>Found Programming string</p>
</c:if>

<c:if test="${fn:containsIgnoreCase(String,'programming') }">
<p>Found Programming string</p>
</c:if>

<c:if test="${fn:endsWith(String,'programming') }">
<p>Found Programming string</p>
</c:if>

<c:set var="string1" value="It is first string."/>
<c:set var="string2" value="It is <xyz>second string.></xyz>"/>

<p>Index-1 : ${fn:indexOf(string1,"It") }</p>
<p>Index-2 : ${fn:indexOf(string2,"second") }</p>

<c:set var="Str1" value=" Welcome to JSTL Programming"/>
<p>String-1 Length is:${fn:length(Str1) }</p>

<c:set var="str2" value="${fn:trim(str1)}"/>
<p>String-2 Length is:${fn:length(str2) }</p>
<p>Final value of string is: ${ str2}</p>











</body>
</html>
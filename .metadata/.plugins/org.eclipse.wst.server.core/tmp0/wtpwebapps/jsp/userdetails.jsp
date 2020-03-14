<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="u" class="jsp.Details"></jsp:useBean>
<jsp:setProperty property="username" name="u"/>
<jsp:setProperty property="passwd" name="u"/>
<jsp:setProperty property="age" name="u"/>

<!-- -
 -->
 You have entered below details:<br>
 <jsp:getProperty property="username" name="u"/><br>
 <jsp:getProperty property="passwd" name="u"/><br>
<jsp:getProperty property="age" name="u"/><br>
 




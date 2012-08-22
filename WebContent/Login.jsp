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
String val=(String)session.getAttribute("loggedin");
if(val!=null){		
response.setStatus(response.SC_MOVED_TEMPORARILY);
response.setHeader("Location","welcome.jsp");
	 System.out.println("Welcome  "+val+"  , <a href=\"logout.jsp\" >Logout</a>");
}
%>
<form action="<%=request.getContextPath() %>/Loginservlet"  method="post"  name="MyForm" >
<fieldset>
<legend>Login-Form</legend>
<label for="username">UserName : </label><input type="text" name="un"><br>
<label for="password">Password : </label><input type="password" name="pass"><a href="register.jsp">Register</a><br>
<input type="submit" value="Click Me" name="login_check" >

</fieldset>
</form>
</body>
</html>
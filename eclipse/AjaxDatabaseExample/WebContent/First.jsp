<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.println("Hello! 5's table is as below"); %>
<% int i,var=5;
//out.println("<table border>");
for(i=1;i<=10;i++)
{
out.println("<table>");
out.println("<br>"+"5*"+i+"="+var*i);

}
%>
</body>
</html>
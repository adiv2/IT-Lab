<%--
  Created by IntelliJ IDEA.
  User: aditya
  Date: 4/10/16
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
><%@ page errorPage="errorHandler.jsp" %>
<html>
<head>
    <title>Divide by Zero</title>
</head>
<body>
<%
    int n1 = Integer.parseInt(request.getParameter("num1"));
    int n2 = Integer.parseInt(request.getParameter("num2"));
    if(n2==0)
    {
        throw new RuntimeException("Don't Divide by zero");
    }
    else{out.println("Answer is "+n1/n2);}
%>
</body>
</html>

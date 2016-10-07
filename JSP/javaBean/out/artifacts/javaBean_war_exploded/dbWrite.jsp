<%--
  Created by IntelliJ IDEA.
  User: aditya
  Date: 4/10/16
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Database write</title>
</head>
<body>
<jsp:useBean id="obj" class="javaBeanimport.DbWrite"/>
<jsp:setProperty name="obj" property="rNum" param="rNum"/>
<jsp:setProperty name="obj" property="name" param="Name" />
<jsp:getProperty name="obj" property="name" />
<%
    obj.dbMaker();
 %>   </br></br>
<%
    out.println("\n"+obj.Name+" and "+obj.rNum+" added to Database");
%>
</br></br></br></br>
</body>
</html>

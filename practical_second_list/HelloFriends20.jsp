<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Hello Friends 20 Times</title>
</head>
<body>
<h2>Hello Friends Printed 20 Times:</h2>
<ul>
<%
    // Loop 20 times
    for(int i = 1; i <= 20; i++) {
%>
    <li>Hello Friends (<%= i %>)</li>
<%
    }
%>
</ul>
</body>
</html>

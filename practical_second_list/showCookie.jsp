<%@ page import="jakarta.servlet.http.Cookie" %>

<html>
<head>
    <title>Show Cookie</title>
</head>
<body>
<h2>Cookie Value:</h2>
<%
    Cookie[] cookies = request.getCookies();
    if(cookies != null){
        for(Cookie c : cookies){
            if("username".equals(c.getName())){
                out.println("Username from cookie: " + c.getValue());
            }
        }
    } else {
        out.println("No cookies found!");
    }
%>
<br>
<a href="SetCookieServlet">Set Cookie Again</a>
</body>
</html>

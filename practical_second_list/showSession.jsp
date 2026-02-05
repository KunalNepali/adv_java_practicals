<%
    // HttpSession session = request.getSession(false); // remove this line

    String username = "Not set";
    String role = "Not set";

    if(session != null) {
        username = (String) session.getAttribute("username");
        role = (String) session.getAttribute("role");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Session Example</title>
</head>
<body>
    <h2>Session Data</h2>
    <p>Username: <b><%= username %></b></p>
    <p>Role: <b><%= role %></b></p>
</body>
</html>

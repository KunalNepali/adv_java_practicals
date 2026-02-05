<%@ page import="java.sql.*" %>
<%@ page import="jakarta.servlet.*" %>
<%@ page import="jakarta.servlet.http.*" %>

<html>
<head>
    <title>Student Table</title>
    <style>
        table, th, td { border: 1px solid black; border-collapse: collapse; padding: 5px; }
        th { background-color: #f2f2f2; }
    </style>
</head>
<body>

<h2>Student Table</h2>

<%
    String url = "jdbc:mysql://localhost:3306/adv_java";
    String user = "root";                  // your MySQL username
    String password = "I@mkunal123";       // your new MySQL root password

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM students");
%>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Course</th>
        </tr>
<%
        while(rs.next()) {
%>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("name") %></td>
            <td><%= rs.getInt("age") %></td>
            <td><%= rs.getString("course") %></td>
        </tr>
<%
        }
%>
    </table>

<%
    } catch(Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        try { if(rs!=null) rs.close(); } catch(Exception e) {}
        try { if(stmt!=null) stmt.close(); } catch(Exception e) {}
        try { if(conn!=null) conn.close(); } catch(Exception e) {}
    }
%>

</body>
</html>

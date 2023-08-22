<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.util.List" %>
   <%@ page import="com.employeeRegistration.*" %>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee list</title>
</head>
<% 
Registerdao rDao = new Registerdao();

List<Member> memberList = rDao.getAllMembers();
 %>
<body>
<form action="EmployeeList" method="get">
<h1>Employee list</h1>
<table >
        <tr>
            <th>Name</th>
            <th>Password</th>
            <th>Email</th>
        </tr>
        <%for(Member member: memberList){%>
            <tr>             
                <td><%=member.getUname() %></td>
                 <td><%=member.getPassword() %></td>
                <td><%=member.getEmail() %></td>
            </tr>
        <%} %>       
    </table>
    </form>
</body>
</html>
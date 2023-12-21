<%-- 
    Document   : login
    Created on : Mar 17, 2023, 9:13:16 AM
    Author     : HP
--%>

<%@page import="dao.StudentDao"%>
<%@page import="models.StudentRegistration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String mail = request.getParameter("email");
        String passwd = request.getParameter("password");
        
        StudentRegistration Stud = new StudentRegistration();
        Stud.setEmail(request.getParameter("email"));
        Stud.setPassword(request.getParameter("password"));
        
        StudentDao dao = new StudentDao();
        dao.saveStudent(Stud);
        
        
        
        %>
        
        <p>
            Your Email is:
            <%=mail%>
            Your password is:
            <%=passwd%>
        </p>
    </body>
</html>

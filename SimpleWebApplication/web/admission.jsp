<%-- 
    Document   : admission
    Created on : Mar 17, 2023, 4:18:06 PM
    Author     : HP
--%>

<%@page import="dao.AdmissionDao"%>
<%@page import="models.Admission"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
    String first = request.getParameter("firstname");
    String last = request.getParameter("lastname");
    String idnumb = request.getParameter("id");
    String datebirth = request.getParameter("dob");
    Part dip = request.getPart("diploma");
    Part pho = request.getPart("photo");
    
    String facu = request.getParameter("faculty");
    String dep = request.getParameter("department");
    
    Admission Admin = new Admission();
    Admin.setFirstname(request.getParameter("firstname"));
    Admin.setLastname(request.getParameter("lastname"));
    Admin.setId(request.getParameter("id"));
    Admin.setDob(request.getParameter("dob"));
    Admin.setPhoto(request.getParameter("photo"));
    
    AdmissionDao AdminDao = new AdmissionDao();
    AdminDao.saveAdmission(Admin);
    %>
    
    <p> First Name is:
    <%=first%>
    </p>
    <p> Last Name is:
    <%=last%>
    </p>
    <p> Your ID/Passport is:
    <%=idnumb%>
    </p>
    <p> Date of Birth is:
    <%=datebirth%>
    </p>
    <p> Diploma is:
    <%=dip%>
    </p>
    <p> Photo is:
    <%=pho%>
    </p>
    <p> Faculty is:
    <%=facu%>
    </p>
    <p> Department is:
    <%=dep%>
    </p>
    
     </body>
    
</html>


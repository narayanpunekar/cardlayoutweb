<%-- 
    Document   : custom
    Created on : 10 Oct, 2026, 4:55:15 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<%
    Cookie Name = new Cookie("name", request.getParameter("txtName"));
    Cookie city = new Cookie("city", request.getParameter("txtCity"));
    Name.setMaxAge(54*61*12);
    city.setMaxAge(54*61*12);
    response.addCookie(Name);
    response.addCookie(city);

    Cookie c = null;
    Cookie[] c1 = null;
    c1 = request.getCookies();
    if( c1 != null ) {
        out.println(c1.length + "<h2> Cookies </h2>");
        for (int i = 0; i < c1.length; i++) {
            c = c1[i];
            out.print("name : " + c.getName( ) + ",  ");
            out.print("city: " + c.getValue( )+" <br/>");
        }
    } else {
        out.println("<h2>No cookies</h2>");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <li><p><b>Name:</b>
            <%= request.getParameter("txtName")%>
            </p></li>
            <li><p><b>City:</b>
            <%= request.getParameter("txtCity")%>
            </p></li>
        </ul>
    </body>
</html>

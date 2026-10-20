<%-- 
    Document   : customtwo
    Created on : 10 Oct, 2026, 5:13:56 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
    <%
        Cookie c = null;
        Cookie[] c1 = null;
        c1 = request.getCookies();
        if( c1 != null ) {
            out.println("<h2> Cookies </h2>");
            for (int i = 0; i < c1.length; i++) {
                c = c1[i];
                if(((c.getName()).compareTo("name") == 0 ) || ((c.getName()).compareTo("city") == 0 ) || ((c.getName()).compareTo("clickedSubmit") == 0 )) {
                    c.setMaxAge(0);
                    response.addCookie(c);
                    out.print("Deleted cookies: " +
                    c.getName( ) + "<br/>");
                }
                out.print("name : " + c.getName( ) + ",  ");
                out.print("city: " + c.getValue( )+" <br/>");
            }
        } else {
            out.println("<h2>No cookies</h2>");
        }
    %>
    </body>
</html>

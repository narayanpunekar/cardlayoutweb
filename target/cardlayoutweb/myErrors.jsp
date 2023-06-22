<%-- 
    Document   : myErrors
    Created on : May 6, 2023, 11:00:00 AM
    Author     : narayan.punekar@yahoo.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <center>
            <table>
                <tr>
                    <td><%@include file="/TheHeader.jsp" %></td>
                </tr>
            </table>
        </center>
        <h2>is experiencing the following problems:</h2>
        <%=exception.toString()%>
        <h2>Please try again later</h2>
        <br>
        <%@include file="/TheFooter.jsp" %>
    </body>
</html>

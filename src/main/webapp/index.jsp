<%-- 
    Document   : index
    Created on : May 3, 2023, 10:46:33 AM
    Author     : narayan.punekar@yahoo.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="myErrors.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form name="frmLogin" id="frmLogin" action="login" method="post">
            <center>
                <table><tr>
                        <td><%@include file="/TheHeader.jsp" %></td>
                </tr></table>
            </center>
            <center>
                <table bgcolor="#CCCCCC" border="0">
                    <th colspan="2"><font size="5">Login</font></th>
                    <tr>
                        <td valign="top">
                            <b><label for="UserName">Employee email</label></b><br>
                            <input type="text" id="txtEmail" name="txtEmail" size="25"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top">
                            <b><label for="Password">Employee password</label></b><br>
                            <input type="password" id="txtPassword" name="txtPassword" size="12"/><br>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" colspan="2">
                            <input type="submit" value="Login"/>
                            <input type="reset" value="Reset"/>
                        </td>
                    </tr>
                </table>
            </center>
            <%@include file="/TheFooter.jsp" %>
    </body>
</html>

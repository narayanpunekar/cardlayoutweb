<%-- 
    Document   : WhereTo
    Created on : May 6, 2023, 10:30:00 AM
    Author     : narayan.punekar@yahoo.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="myErrors.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Where To?</title>
    </head>
    <body>
        <form name="frmWhereTo" id="frmWhereTo" action="WhereToController.jsp" method="post">
            <center>
                <table><tr>
                        <td><%@include file="/TheHeader.jsp" %></td>
                </tr></table>
            </center>
            <center>
                <table bgcolor="#CCCCCC" border="0">
                    <th colspan="2"><font size="5">Login</font></th>
                    <tr>
                        <td valign="top" colspan="2">
                            <b>Where To?<sup>*</sup></b><br>
                            <input type="radio" id="rdoWhereTo" name="rdoWhereTo" value="IT Department" checked/>IT Department&nbsp;<br>
                            <input type="radio" id="rdoWhereTo" name="rdoWhereTo" value="Solutions Department"/>Solutions Department&nbsp;<br>
                            <input type="radio" id="rdoWhereTo" name="rdoWhereTo" value="Product Backlog"/>Product Backlog&nbsp;<br>
                            <input type="radio" id="rdoWhereTo" name="rdoWhereTo" value="Pie Chart"/>Pie Chart&nbsp;<br>
                            <input type="radio" id="rdoWhereTo" name="rdoWhereTo" value="Bar Chart"/>Bar Chart&nbsp;<br>
                            <input type="radio" id="rdoWhereTo" name="rdoWhereTo" value="LAN/WLAN Chat"/>LAN/WLAN Chat&nbsp;<br>
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
        </form>
    </body>
</html>

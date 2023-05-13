<%-- 
    Document   : ITDepartment
    Created on : May 3, 2023, 11:37:27 AM
    Author     : narayan.punekar@yahoo.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="myErrors.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IT Support Request</title>
    </head>
    <body>
        <form name="frmItdepartment" id="frmItdepartment" action="ITDepartment_1.jsp" method="post">
            <center>
                <table>
                    <tr>
                        <td><%@include file="/TheHeader.jsp" %></td>
                    </tr>
                </table>
            </center>
            <center>
                <h1>IT Support Request</h1>
                <hr>
                <br>
                <table align="center" width="100%" cellspacing="2" cellpadding="2">
                    <tr>
                        <td align="right">First Name:</td>
                        <td><input type="text" id="txtFirstName" name="txtFirstName" align="left" size="25"/></td>
                        <td align="right">Last Name:</td>
                        <td><input type="text" id="txtLastName" name="txtLastName" align="left" size="25"/></td>
                    </tr>
                    <tr>
                        <td align="right">E-mail:</td>
                        <td><input type="text" id="txtEmail" name="txtEmail" align="left" size="25"/></td>
                        <td align="right">Phone:</td>
                        <td><input type="text" id="txtPhone" name="txtPhone" align="left" size="15"/></td>
                    </tr>
                    <tr>
                        <td align="right">Software:</td>
                        <td>
                            <input type="checkbox" id="chcWord" name="chcWord" value="Word"/>Word&nbsp;
                            <input type="checkbox" id="chcExcel" name="chcExcel" value="Excel"/>Excel&nbsp;
                            <input type="checkbox" id="chcPowerpoint" name="chcPowerpoint" value="Powerpoint"/>Powerpoint&nbsp;
                            <input type="checkbox" id="chcOutlook" name="chcOutlook" value="Outlook"/>Outlook&nbsp;
                            <input type="checkbox" id="chcVarious" name="chcVarious" value="Various"/>Various&nbsp;
                        </td>
                        <td align="right">Operating System:</td>
                        <td>
                            <select id="selOs" name="selOs" size="1">
                                <option value="Windows">Windows</option>
                                <option value="Unix">Unix</option>
                                <option value="Linux">Linux</option>
                                <option value="OSX">OSX</option>
                                <option value="Mobile">Mobile</option>
                            </select>
                        </td>
                    </tr>
                </table>
            </center>
            <br>Problem Description:
            <br><textarea id="txaProblemDescription" name="txaProblemDescription" rows="4" cols="50"></textarea>
            <hr>
            <br>
            <center>
                <input type="submit" value="Submit Request"/>
            </center>
            <%@include file="/TheFooter.jsp" %>
       </form>
    </body>
</html>

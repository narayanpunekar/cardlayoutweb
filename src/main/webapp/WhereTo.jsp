<%-- 
    Document   : WhereTo
    Created on : May 6, 2023, 10:30:00 AM
    Author     : narayan.punekar@yahoo.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="myErrors.jsp"%>
<%
    String strFirstName = request.getParameter("txtFirstName");
    String strLastName = request.getParameter("txtLastName");
    String strEmail = request.getParameter("txtEmail");
    String strPhone = request.getParameter("txtPhone");
    String strWord = request.getParameter("chcWord");
    String strExcel = request.getParameter("chcExcel");
    String strPowerpoint = request.getParameter("chcPowerpoint");
    String strOutlook = request.getParameter("chcOutlook");
    String strVarious = request.getParameter("chcVarious");
    String strOs = request.getParameter("selOs");
    String strProblemDescription = request.getParameter("txaProblemDescription");
    String strPhoneOne = request.getParameter("txtPhoneOne");
    String strPhoneTwo = request.getParameter("txtPhoneTwo");
    String strAddress = request.getParameter("txtAddress");
    String strZipCode = request.getParameter("txtZipCode");
    String rdoFaxPager = request.getParameter("rdoFaxPager");
    String strFaxPager = request.getParameter("txtFaxPager");
    String strUserName = request.getParameter("txtUserName");
    String rdoUserType = request.getParameter("rdoUserType");
    String strPassword = request.getParameter("txtPassword");
    String rdoNewsletters = request.getParameter("rdoNewsletters");
%>
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

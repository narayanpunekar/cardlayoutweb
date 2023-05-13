<%-- 
    Document   : ITDepartment
    Created on : May 3, 2023, 11:37:27 AM
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
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IT Department</title>
    </head>
    <body>
        <form name="frmItdepartment_1" id="frmItdepartment_1" method="post">
            <center>
                <table><tr>
                        <td><%@include file="/TheHeader.jsp" %></td>
                </tr></table>
            </center>
            <center>
                <h1>IT Support Request</h1>
                <hr>
                <br>
                <table align="center" width="100%" cellspacing="2" cellpadding="2">
                    <tr>
                        <td align="right">First Name:</td>
                        <td><input type="text" id="txtFirstName" name="txtFirstName" align="left" size="25" value="<%=strFirstName%>" disabled="true"/></td>
                        <td align="right">Last Name:</td>
                        <td><input type="text" id="txtLastName" name="txtLastName" align="left" size="25" value="<%=strLastName%>" disabled="true"/></td>
                    </tr>
                    <tr>
                        <td align="right">E-mail:</td>
                        <td><input type="text" id="txtEmail" name="txtEmail" align="left" size="25" value="<%=strEmail%>" disabled="true"/></td>
                        <td align="right">Phone:</td>
                        <td><input type="text" id="txtPhone" name="txtPhone" align="left" size="15" value="<%=strPhone%>" disabled="true"/></td>
                    </tr>
                    <tr>
                        <td align="right">Software:</td>
                        <td>
                            <input type="checkbox" id="chcWord" name="chcWord" value="Word" <%if("Word".equals(strWord)) {%> checked <% } %>/>
                            <input type="checkbox" id="chcExcel" name="chcExcel" value="Excel" <%if("Excel".equals(strExcel)) {%> checked <% } %>/>
                            <input type="checkbox" id="chcPowerpoint" name="chcPowerpoint" value="Powerpoint" <%if("Powerpoint".equals(strPowerpoint)) {%> checked <% } %>/>
                            <input type="checkbox" id="chcOutlook" name="chcOutlook" value="Outlook" <%if("Outlook".equals(strOutlook)) {%> checked <% } %>/>
                            <input type="checkbox" id="chcVarious" name="chcVarious" value="Various" <%if("Various".equals(strVarious)) {%> checked <% } %>/>
                        </td>
                        <td align="right">Operating System:</td>
                        <td>
                            <select id="selOs" name="selOs" size="1" disabled="true">
                                <option value="Windows" <%if("Windows".equals(strOs)) {%> selected <% } %>>Windows</option>
                                <option value="Unix" <%if("Unix".equals(strOs)) {%> selected <% } %>>Unix</option>
                                <option value="Linux" <%if("Linux".equals(strOs)) {%> selected <% } %>>Linux</option>
                                <option value="OSX" <%if("OSX".equals(strOs)) {%> selected <% } %>>OSX</option>
                                <option value="Mobile" <%if("Mobile".equals(strOs)) {%> selected <% } %>>Mobile</option>
                            </select>
                        </td>
                    </tr>
                </table>
            </center>
            <br>Problem Description:
            <br>
            <textarea id="txaProblemDescription" name="txaProblemDescription" rows="4" cols="50" disabled="true"><%=strProblemDescription%></textarea>

            <center>
                <hr>
                <br>
                <table align="center" width="100%" cellspacing="2" cellpadding="2" bgcolor="#CCCCCC" border="0">
                    <tr>
                        <td valign="top"><b>Address:<sup>*</sup></b></td>
                        <td><input type="text" id="txtAddress" name="txtAddress" size="25"/></td>
                        <td valign="top"><b>Zip Code<sup>*</sup></b></td>
                        <td><input type="text" id="txtZipCode" name="txtZipCode" size="7" maxlength="7"/></td>
                    </tr>
                    <tr>
                        <td valign="top"><b>Phone:Primary</b></td>
                        <td><input type="text" id="txtPhoneOne" name="txtPhoneOne" size="15"/></td>
                        <td valign="top"><b>Phone:Secondary</b></td>
                        <td><input type="text" id="txtPhoneTwo" name="txtPhoneTwo" size="15"/></td>
                    </tr>
                    <tr>
                        <td valign="top"><b>Fax or Pager: select any one</b></td>
                        <td>
                            <input type="radio" id="rdoFaxPager" name="rdoFaxPager" value="Fax" checked/>Fax&nbsp;
                            <input type="radio" id="rdoFaxPager" name="rdoFaxPager" value="Pager"/>Pager
                            <br>
                        </td>
                        <td valign="top"><b>Fax Pager</b></td>
                        <td><input type="text" id="txtFaxPager" name="txtFaxPager" size="20"/></td>
                    </tr>
                    <tr>
                        <td valign="top" colspan="2"><b>User ID<sup>*</sup></b></td>
                        <td><input type="text" id="txtUserName" name="txtUserName" size="10"/></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td valign="top" colspan="2"><b>Who are you?<sup>*</sup></b></td>
                        <td>
                            <input type="radio" id="rdoUserType" name="rdoUserType" value="Consumer" checked/>Consumer&nbsp;
                            <input type="radio" id="rdoUserType" name="rdoUserType" value="Employee"/>Employee&nbsp;
                            <input type="radio" id="rdoUserType" name="rdoUserType" value="Agent"/>Agent&nbsp;
                            <input type="radio" id="rdoUserType" name="rdoUserType" value="Partner"/>Partner
                        </td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td valign="top"><b>Password<sup>*</sup></b></td>
                        <td><input type="password" id="txtPassword" name="txtPassword" size="12"/></td>
                        <td valign="top"><b>Confirm Password<sup>*</sup></b></td>
                        <td><input type="password" id="txtPasswordConfirm" name="txtPasswordConfirm" size="12"/></td>
                    </tr>
                    <tr>
                        <td valign="top" colspan="2"><b>Would you like to receive newsletters?</b></td>
                        <td>
                            <input type="radio" id="rdoNewsletters" name="rdoNewsletters" value="Yes" checked/>Yes&nbsp;
                            <input type="radio" id="rdoNewsletters" name="rdoNewsletters" value="No"/>No
                        </td>
                        <td></td>
                        <td></td>
                    </tr>
                    <br>
                    <tr><td><sup>*</sup> Required Information</td></tr>
                    <br>
                </table>
            </center>
            <hr>
            <br>
            <center>
                <input type="submit" value="Submit Request" onclick="window.showModalDialog('');"/>
            </center>
            <%@include file="/TheFooter.jsp" %>
       </form>
        
    </body>
</html>

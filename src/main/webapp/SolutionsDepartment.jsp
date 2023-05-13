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
        <title>IT Department</title>
    </head>
    <body>
        <form name="frmSolutionsdepartment" id="frmSolutionsdepartment" action="solutionsdepartment" method="post">
            <center>
                <table><tr>
                        <td><%@include file="/TheHeader.jsp" %></td>
                </tr></table>
            </center>
            <center>
                <table bgcolor="#CCCCCC" border="0">
                    <th colspan="2"><font size="5">Solutions Department</font></th>
                    <tr>
                        <td valign="top">
                            <b>First Name<sup>*</sup></b><br>
                            <input type="text" id="txtFirstName" name="txtFirstName" size="15"/>
                        </td>
                        <td valign="top">
                            <b>Last Name<sup>*</sup></b><br>
                            <input type="text" id="txtLastName" name="txtLastName" size="15"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top">
                            <b>Address<sup>*</sup></b><br>
                            <input type="text" id="txtAddress" name="txtAddress" size="25"/><br>
                        </td>
                        <td valign="top">
                            <b>Zip Code<sup>*</sup></b><br>
                            <input type="text" id="txtZipCode" name="txtZipCode" size="7" maxlength="7"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top">
                            <b>E-mail</b><br>
                            <input type="text" id="txtEmail" name="txtEmail" size="25"/><br>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top">
                            <b>Phone:Primary</b><br>
                            <input type="text" id="txtPhoneOne" name="txtPhoneOne" size="15"/>
                        </td>
                        <td valign="top">
                            <b>Phone:Secondary</b><br>
                            <input type="text" id="txtPhoneTwo" name="txtPhoneTwo" size="15"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top">
                            <b>Fax or Pager: select any one</b><br>
                            <input type="radio" id="rdoFaxPager" name="rdoFaxPager" value="Fax" checked/>Fax&nbsp;
                            <input type="radio" id="rdoFaxPager" name="rdoFaxPager" value="Pager"/>Pager
                            <br>
                        </td>
                        <td valign="top">
                            <b>Fax Pager</b><br>
                            <input type="text" id="txtFaxPager" name="txtFaxPager" size="20"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" colspan="2">
                            <b>Operating System: select any one</b><br>
                            <input type="checkbox" id="chcWindows" name="chcWindows" value="Windows"/>Windows&nbsp;
                            <input type="checkbox" id="chcUnix" name="chcUnix" value="Unix"/>Unix&nbsp;
                            <input type="checkbox" id="chcLinux" name="chcLinux" value="Linux"/>Linux&nbsp;
                            <input type="checkbox" id="chcOsx" name="chcOsx" value="OSX"/>OSX&nbsp;
                            <input type="checkbox" id="chcMobile" name="chcMobile" value="Mobile"/>Mobile&nbsp;
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" colspan="2">
                            <b>Software</b><br>
                            <input type="checkbox" id="chcWord" name="chcWord" value="Word"/>Word&nbsp;
                            <input type="checkbox" id="chcExcel" name="chcExcel" value="Excel"/>Excel&nbsp;
                            <input type="checkbox" id="chcPowerpoint" name="chcPowerpoint" value="Powerpoint"/>Powerpoint&nbsp;
                            <input type="checkbox" id="chcOutlook" name="chcOutlook" value="Outlook"/>Outlook&nbsp;
                            <input type="checkbox" id="chcVarious" name="chcVarious" value="Various"/>Various&nbsp;
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top">
                            <b>Problem Description</b><br>
                            <textarea id="txaProblemDescription" name="txaProblemDescription" rows="4" cols="57"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top">
                            <b>Solution Description</b><br>
                            <textarea id="txaSolutionDescription" name="txaSolutionDescription" rows="4" cols="57"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" colspan="2">
                            <b>User ID<sup>*</sup></b><br>
                            <input type="text" id="txtUserName" name="txtUserName" size="10"/><br>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" colspan="2">
                            <b>Who are you?<sup>*</sup></b><br>
                            <input type="radio" id="rdoUserType" name="rdoUserType" value="Consumer" checked/>Consumer&nbsp;
                            <input type="radio" id="rdoUserType" name="rdoUserType" value="Employee"/>Employee&nbsp;
                            <input type="radio" id="rdoUserType" name="rdoUserType" value="Agent"/>Agent&nbsp;
                            <input type="radio" id="rdoUserType" name="rdoUserType" value="Partner"/>Partner
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top">
                            <b>Password<sup>*</sup></b><br>
                            <input type="password" id="txtPassword" name="txtPassword" size="12"/>
                        </td>
                        <td valign="top">
                            <b>Confirm Password<sup>*</sup></b><br>
                            <input type="password" id="txtPasswordConfirm" name="txtPasswordConfirm" size="12"/>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" colspan="2">
                            <b>Would you like to receive newsletters?</b><br>
                            <input type="radio" id="rdoNewsletters" name="rdoNewsletters" value="Yes" checked/>Yes&nbsp;
                            <input type="radio" id="rdoNewsletters" name="rdoNewsletters" value="No"/>No
                        </td>
                    </tr>
                    <br>
                    <tr><td><sup>*</sup> Required Information</td></tr>
                    <br>
                    <tr>
                        <td valign="top" colspan="2">
                            <label for="lblRating">In general, would you say your rating is</label><br>
                            * Taking 1 to be poor and 10 to be excellent<br>
                            <input type="number" id="nbrRating" name="nbrRating" min="1" max="10">                            
                        </td>
                    </tr>
                    <tr>
                        <td valign="top" colspan="2">
                            * Taking 1 to be strongly disagree and 10 to be strongly agree<br>
                            1<input type="range" id="rngRating" name="rngRating" min="1" max="10">10                           
                        </td>
                    </tr>
                    <br>
                    <tr>
                        <td align="center" colspan="2">
                            <input type="submit" value="Submit Request"/>
                            <input type="reset" value="Reset"/>
                        </td>
                    </tr>
                </table>
            </center>
            <%@include file="/TheFooter.jsp" %>
       </form>
    </body>
</html>

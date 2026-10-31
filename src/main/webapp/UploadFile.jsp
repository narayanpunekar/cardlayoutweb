<%-- 
    Document   : UploadFile
    Created on : 
    Author     : narayan.punekar@yahoo.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="static java.lang.System.out"%>
<%@page errorPage="myErrors.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>File Upload</title>
    </head>
    <body>
        <form name="frmFileUpload" id="frmFileUpload" action="fileupload" method="post" enctype="multipart/form-data">
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
                            <b><label for="File:">File:</label></b><br>
                        </td>
                        <td valign="top">
                            <input type="file" name="file" id="file"><br>
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

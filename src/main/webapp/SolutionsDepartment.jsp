<%-- 
    Document   : SolutionsDepartment
    Created on : May 3, 2023, 11:37:27 AM
    Author     : narayan.punekar@yahoo.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="static java.lang.System.out"%>
<%@page errorPage="myErrors.jsp"%>
<!DOCTYPE html>
<html>
    <body onload="frmSolutionsdepartment.submit()">
        <form hidden name="frmSolutionsdepartment" id="frmSolutionsdepartment" action="solutions" method="post">
            <input type="hidden" id="iCnt" name="iCnt" value="1"/>
        </form>
    </body>
</html>

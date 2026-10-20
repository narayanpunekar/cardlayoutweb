<%-- 
    Document   : WhereTo_1
    Created on : May 6, 2023, 10:30:00 AM
    Author     : narayan.punekar@yahoo.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="static java.lang.System.out"%>
<%@page import="java.util.HashMap"%>
<%@page errorPage="myErrors.jsp"%>
<!DOCTYPE html>
<html>
    <body onload="frmWhereTo_1.submit()">
        <%
        HashMap<String, String> key = (HashMap<String, String>)request.getAttribute("key");
        out.println("key.size=" + key.size());
        out.println("strFirstName=" + key.get("strFirstName"));
        %>
        <form hidden name="frmWhereTo_1" id="frmWhereTo_1" action="WhereToController.jsp" method="post">
            <input type="hidden" id="rdoWhereTo" name="rdoWhereTo" value="Solutions Department_1"/>
        </form>
    </body>
</html>

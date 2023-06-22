<%-- 
    Document   : WhereToController
    Created on : May 6, 2023, 10:30:00 AM
    Author     : narayan.punekar@yahoo.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="static java.lang.System.out"%>
<%@page errorPage="myErrors.jsp"%>
<!DOCTYPE html>
<% 
    String strWhereTo = request.getParameter("rdoWhereTo");
    out.println(strWhereTo);
%>
<%  if("IT Department".equals(strWhereTo)) { %>
        <jsp:forward page="/ITDepartment.jsp"/>
<%  } else if("Solutions Department".equals(strWhereTo)) { %>
        <jsp:forward page="/SolutionsDepartment.jsp"/>
<%  } else if("Product Backlog".equals(strWhereTo)) { %>
        <jsp:forward page="/ProductBacklog.jsp"/>
<%  } else if("Pie Chart".equals(strWhereTo)) { %>
        <jsp:forward page="/PieChart.jsp"/>
<%  } else if("Bar Chart".equals(strWhereTo)) { %>
        <jsp:forward page="/BarChart.jsp"/>
<%  } else if("LAN/WLAN Chat".equals(strWhereTo)) { %>
        <jsp:forward page="/Chat.jsp"/>
<%  } %>

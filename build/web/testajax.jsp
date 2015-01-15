<%-- 
    Document   : testajax
    Created on : Apr 1, 2013, 6:15:42 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
request.getSession().setAttribute("login", "false");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="javascripts/jquery-1.6.1.min.js"></script>
            <script type="text/javascript">// <![CDATA[
    $(document).ready(function() {
  //  $.ajaxSetup({ cache: false }); // This part addresses an IE bug. without it, IE will only load the first number and will never refresh
    setInterval(function() {
    $('#divToRefresh').load();
    }, 1000); // the "3000" here refers to the time to refresh the div. it is in milliseconds.
    });
    // ]]></script>
        <title>JSP Page</title>
    </head>
    <body>
        <a href="signup.jsp">click</a>
        <div id="divToRefresh"></div>
    </body>
</html>

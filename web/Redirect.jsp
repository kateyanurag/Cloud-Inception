<%-- 
    Document   : Redirect
    Created on : Mar 27, 2013, 9:13:55 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form   action="UserNameValidate" method="POST">
          Username&nbsp;<input type="text" name="username"/><br/><br/>
          Password&nbsp;&nbsp;<input type="password" id="password"/><br/><br/>
          <input type="submit" value="Login"  />          
      </form>
    </body>
</html>

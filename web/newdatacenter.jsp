<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%!
String first_name="";
%>

<html>
<head>
<title>A very Simple jQuery Popup</title>
<script type="text/javascript" src="javascripts/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="javascripts/signup.js"></script>
<script type="text/javascript" src="javascripts/registration.js"></script>
<link href="stylesheets/signup.css" rel="stylesheet"/>
<link href="stylesheets/registration.css" rel="stylesheet"/>

<style>
</style>

</head>
<%@page  import="java.io.*" %>
<body id="bod">

   
<a href="#" id="pop" >Click Here to SignUp </a>
<br />

<form >
  <table border="0" id="form_table" style="display:none;margin-top:100px;position:'absolute'">
      
  <tr>
    <th width="25%">DataCenter Name &#8250;</th>
    <td>
          <input type="text" name="datacentername" id="datacenter_name" >
        <span id="dcn"></span>
    </td>
  </tr>
  <tr>
    <th width="25%">DataCenter Type &#8250;</th>
    <td>
          <input type="text" name="datacentertype" id="datacenter_type">
        <span id="dctype"></span>
    </td>
  </tr>
  <tr>
    <th> </th>
    <td>
        <input type="submit" name="submit" value="Submit Form" id="datacenterclose">
    </td>
  </tr>
</table>




</body>
</html>
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
<script>
    $(document).ready(function(){
    $("#close").click(function(){
       
          $("#form_table").fadeOut(500);
          
     $("#bod").css({background : 'white'});
    
    $("#form_table1").fadeIn(3000);
    positionPopup1();
    $("#bod").css({background : 'darkgray'});
   
});
});
function positionPopup1(){
  if(!$("#form_table1").is(':visible')){
    return;
  }
  $("#form_table1").css({
      left: ($(window).width() - $('#form_table1').width()) / 2,
      top: ($(window).width() - $('#form_table').width()) / 40,
      position:'absolute'
  });
    
            
}


</script>
<style>
    #form_table input + span, #form_table textarea + span, form_table select + span{
	display: none;
	background:url('images/message.png') no-repeat center left;
        
     
	line-height: 32px;
	font-size: 12px;
	font-weight: bold;
	color: #000;
	padding:0px 20px;
	position: absolute;
	width: 180px;
	z-index:99;
	}
 
</style>

</head>
<%@page  import="java.io.*" %>
<body id="bod">

   
<a href="#" id="pop" >Click Here to SignUp </a>
<br />
<!form id="overlay_form" style="display:none">
<form method="Post" action="Register">
  <table border="0" id="form_table" style="display:none">
      
  <tr>
    <th width="25%">First Name &#8250;</th>
    <td>
          <input type="text" name="firstname" id="first_name" >
        <span id="fn"></span>
    </td>
  </tr>
  <tr>
    <th width="25%">Last Name &#8250;</th>
    <td>
          <input type="text" name="lastname" id="last_name">
        <span id="ln"></span>
    </td>
  </tr>
  <tr>
    <th>Email &#8250;</th>
    <td>
    <input type="text" name="emailid" id="email_id">
    <span id="eid"></span>
    </td>
  </tr>
  <tr>
    <th>Username &#8250;</th>
    <td>
    <input type="text" name="username" id="user_name"  >
    <span id="un"> </span>
    </td>
  </tr>
  <tr>
    <th>Password &#8250;</th>
    <td>
    <input type="password" name="password" id="password">
    <span id="pass"></span>
    </td>
  </tr>
  <tr>
    <th>Country &#8250;</th>
    <td>
    <input type="text" name="country" id="country">
    <span id="cn"></span>
    </td>
  </tr>
  <tr>
    <th>Contact No. &#8250;</th>
    <td>
    <input type="text" name="contactno" id="contact_no">
    <span id="cno"></span>
    </td>
  </tr>
  <tr>
    <th>Company Name &#8250;</th>
    <td>
    <input type="text" name="company" id="company">
    <span id="con"></span>
    </td>
  </tr>
  <tr>
      <th>No of Employees &#8250;</th>
    <td>
    <input type="text" name="noofemployees" id="no_of_employees">
    <span id="noe"></span>
    </td>
  </tr>
  <tr>
    <th>User type &#8250;</th>
    <td>
        <select name="usertype" id="user_type"  >
         <option value=""></option>
        <option value="Administrator">Cloud Administrator</option>
        <option value="Cloud Client">Cloud Client</option >
        
    </select>
    <span id="ut">Select the User Type</span>
    </td>
  </tr>
  <tr>
    <th> </th>
    <td>
    <input type="submit" name="submit" value="Submit Form" id="close1">

    </td>
  </tr>
</table>




</body>
</html>
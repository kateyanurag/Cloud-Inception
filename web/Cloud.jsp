<%-- 
    Document   : Cloud
    Created on : Apr 8, 2013, 10:26:35 PM
    Author     : ABHISHEK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="javascripts/jquery-1.6.1.min.js"></script>
        <script type="text/javascript" src="javascripts/signup.js"></script>
<script type="text/javascript" src="javascripts/registration.js"></script>
<link href="stylesheets/signup.css" rel="stylesheet"/>
<link href="stylesheets/registration.css" rel="stylesheet"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cloud</title>
        
        <style>
        #form_datacenter input + span, #form_datacenter textarea + span, form_datacenter select + span{
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

             div#buttonpanel
             {  margin-left:232px;
                
                border-width: 10px;
                border:red;
                width: 45%;
                border-style:solid;  
                padding: 10px;
              
             }
             div#buttonpanel input
             {
                font-size: 20px;
                color: white;
                border-color: yellow;
                border-width: 4px;
                background-color: blue;
                -moz-border-radius:80px;
	-webkit-border-radius:8px;
        width: 105px;
        
             }
            div#controlpanel
            {
                margin-left:20px;
                display:block;
                border-width: 10px;
                border:red;
                width: 165px;
                border-style:solid;  
                padding: 10px;
                float:left;
            }
            div#controlpanel input
            {
                display:block;
                font-size: 20px;
                color: white;
                border-color: yellow;
                border-width: 4px;
                background-color: blue;
                -moz-border-radius:80px;
	-webkit-border-radius:8px;
        width: 160px;
            }
             
           
            div#displayinfo
            {
                margin-left:20px;
                display:block;
                border-width: 10px;
                border:red;
                width: 600px;
                border-style:solid;  
               
                float:left;
                height:500px;
             
            }
        </style>
        <script>
            
            window.onload = initall;
            var current_thread='';
            var current_header_thread='';
  
  
  
  
  function initall()
  {
  
  
            initialize();
            document.getElementById("newbtn").setAttribute("disabled", "disabled");
            document.getElementById("removebtn").setAttribute("disabled", "disabled");
            document.getElementById("editbtn").setAttribute("disabled", "disabled");
            document.getElementById("approvebtn").setAttribute("disabled", "disabled");
            document.getElementById("consolebtn").setAttribute("disabled", "disabled");
            document.getElementById("datacentersbtn").onclick = showdatacenters;
            document.getElementById("clustersbtn").onclick = showclusters;
            document.getElementById("hostsbtn").onclick = showhosts;
            document.getElementById("storagebtn").onclick = showstorage;
            document.getElementById("vmsbtn").onclick = showvms;
            document.getElementById("templatesbtn").onclick = showtemplates;
            document.getElementById("usersbtn").onclick = showusers;
            
        }
        function reinitializebuttonpanel(newbtn,removebtn,editbtn,approvebtn,consolebtn)
      {
         
            document.getElementById("newbtn").disabled=newbtn;
            document.getElementById("removebtn").disabled=removebtn;
            document.getElementById("editbtn").disabled=editbtn;
            document.getElementById("approvebtn").disabled=approvebtn;
            document.getElementById("consolebtn").disabled=consolebtn;
      }
        function initialize()
        {
            
             var  XMLHttpRequestObject = new XMLHttpRequest();
        
            intializedatacenters(XMLHttpRequestObject);
            intializeclusters(XMLHttpRequestObject);
            intializehosts(XMLHttpRequestObject);
            intializestorage(XMLHttpRequestObject);
            intializevms(XMLHttpRequestObject);
            intializetemplates(XMLHttpRequestObject);
            intializeusers(XMLHttpRequestObject);
            
            
        }
      function  intializedatacenters(XMLHttpRequestObject)
        {
             if(XMLHttpRequestObject) {

                XMLHttpRequestObject.open("GET", "http://localhost:8080/Trialcloud/Users/" + <%=request.getSession().getAttribute("username") %>+"/Datacenter.xml",true); 
                XMLHttpRequestObject.setRequestHeader("Content-type","application/x-www-form-urlencoded");
                XMLHttpRequestObject.onreadystatechange = function() 
          { 
              
              
            if (XMLHttpRequestObject.readyState == 4 && XMLHttpRequestObject.status == 200)  
               { 
                   var xmldata=XMLHttpRequestObject.responseXML.getElementsByTagName("Datacenter");
                  for(var i=0;i<xmldata.length;i++)
 $('#currentdatacenters').append('<div id=' + xmldata[i].getElementsByTagName("DatacenterId")[0].firstChild.textContent + '></div>');
               }         
                  
          }
          XMLHttpRequestObject.send(null);
          
     }
          
        }
       function intializeclusters(XMLHttpRequestObject)
       {
           if(XMLHttpRequestObject) {

                XMLHttpRequestObject.open("GET", "http://localhost:8080/Trialcloud/Users/" + <%=request.getSession().getAttribute("username") %>+"/Cluster.xml",true); 
                XMLHttpRequestObject.setRequestHeader("Content-type","application/x-www-form-urlencoded");
                XMLHttpRequestObject.onreadystatechange = function() 
          { 
              
              
            if (XMLHttpRequestObject.readyState == 4 && XMLHttpRequestObject.status == 200)  
               { 
                   var xmldata=XMLHttpRequestObject.responseXML.getElementsByTagName("Cluster");
                  for(var i=0;i<xmldata.length;i++)
 $('#currentClusters').append('<div id=' + xmldata[i].getElementsByTagName("ClusterId")[0].firstChild.textContent + '></div>');
               }         
                  
          }
          XMLHttpRequestObject.send(null);
          
     }
       }
       
       
       
      function  intializehosts(XMLHttpRequestObject)
      {
          if(XMLHttpRequestObject) {

                XMLHttpRequestObject.open("GET", "http://localhost:8080/Trialcloud/Users/" + <%=request.getSession().getAttribute("username") %>+"/Host.xml",true); 
                XMLHttpRequestObject.setRequestHeader("Content-type","application/x-www-form-urlencoded");
                XMLHttpRequestObject.onreadystatechange = function() 
          { 
              
              
            if (XMLHttpRequestObject.readyState == 4 && XMLHttpRequestObject.status == 200)  
               { 
                   var xmldata=XMLHttpRequestObject.responseXML.getElementsByTagName("Host");
                  for(var i=0;i<xmldata.length;i++)
 $('#currenthosts').append('<div id=' + xmldata[i].getElementsByTagName("HostId")[0].firstChild.textContent + '></div>');
               }         
                  
          }
          XMLHttpRequestObject.send(null);
          
     }
      }
    function intializestorage(XMLHttpRequestObject)
    {
        if(XMLHttpRequestObject) {

                XMLHttpRequestObject.open("GET", "http://localhost:8080/Trialcloud/Users/" + <%=request.getSession().getAttribute("username") %>+"/Storage.xml",true); 
                XMLHttpRequestObject.setRequestHeader("Content-type","application/x-www-form-urlencoded");
                XMLHttpRequestObject.onreadystatechange = function() 
          { 
              
              
            if (XMLHttpRequestObject.readyState == 4 && XMLHttpRequestObject.status == 200)  
               { 
                   var xmldata=XMLHttpRequestObject.responseXML.getElementsByTagName("Storage");
                  for(var i=0;i<xmldata.length;i++)
 $('#currentstorage').append('<div id=' + xmldata[i].getElementsByTagName("StorageId")[0].firstChild.textContent + '></div>');
               }         
                  
          }
          XMLHttpRequestObject.send(null);
          
     }
    }
    function intializevms(XMLHttpRequestObject)
    {
        if(XMLHttpRequestObject) {

                XMLHttpRequestObject.open("GET", "http://localhost:8080/Trialcloud/Users/" + <%=request.getSession().getAttribute("username") %>+"/Vm.xml",true); 
                XMLHttpRequestObject.setRequestHeader("Content-type","application/x-www-form-urlencoded");
                XMLHttpRequestObject.onreadystatechange = function() 
          { 
              
              
            if (XMLHttpRequestObject.readyState == 4 && XMLHttpRequestObject.status == 200)  
               { 
                   var xmldata=XMLHttpRequestObject.responseXML.getElementsByTagName("Vm");
                  for(var i=0;i<xmldata.length;i++)
 $('#currentvms').append('<div id=' + xmldata[i].getElementsByTagName("VmId")[0].firstChild.textContent + '></div>');
               }         
                  
          }
          XMLHttpRequestObject.send(null);
          
     }
        
    }
    function intializetemplates(XMLHttpRequestObject)
    {
        if(XMLHttpRequestObject) {

                XMLHttpRequestObject.open("GET", "http://localhost:8080/Trialcloud/Users/" + <%=request.getSession().getAttribute("username") %>+"/Template.xml",true); 
                XMLHttpRequestObject.setRequestHeader("Content-type","application/x-www-form-urlencoded");
                XMLHttpRequestObject.onreadystatechange = function() 
          { 
              
              
            if (XMLHttpRequestObject.readyState == 4 && XMLHttpRequestObject.status == 200)  
               { 
                   var xmldata=XMLHttpRequestObject.responseXML.getElementsByTagName("Template");
                  for(var i=0;i<xmldata.length;i++)
 $('#currenttemplates').append('<div id=' + xmldata[i].getElementsByTagName("TemplateId")[0].firstChild.textContent + '></div>');
               }         
                  
          }
          XMLHttpRequestObject.send(null);
          
     }
        
    }
    function intializeusers(XMLHttpRequestObject)
    {
        if(XMLHttpRequestObject) {

                XMLHttpRequestObject.open("GET", "http://localhost:8080/Trialcloud/Users/" + <%=request.getSession().getAttribute("username") %>+"/User.xml",true); 
                XMLHttpRequestObject.setRequestHeader("Content-type","application/x-www-form-urlencoded");
                XMLHttpRequestObject.onreadystatechange = function() 
          { 
              
              
            if (XMLHttpRequestObject.readyState == 4 && XMLHttpRequestObject.status == 200)  
               { 
                   var xmldata=XMLHttpRequestObject.responseXML.getElementsByTagName("User");
                  for(var i=0;i<xmldata.length;i++)
 $('#currentusers').append('<div id=' + xmldata[i].getElementsByTagName("UserId")[0].firstChild.textContent + '></div>');
               }         
                  
          }
          XMLHttpRequestObject.send(null);
          
     }
        
    }
        function currentinfo(header)
        {
            var headerdata=header;
            
            current_thread.css('display','block'); 
           current_header_thread.css({'display':'block'});
          
    headerdata.css({'backgroundColor':'yellow','align':'center','border-width':'5px','border-style':'solid'});
        
        }
                function showdatacenters()
        {
            
            reinitializebuttonpanel(false,false,false,true,true);
          if(current_header_thread != '')
          current_header_thread.css('display','none');   
            
          if(current_thread != '')
          current_thread.css('display','none');  
          
          current_thread=$('#currentdatacenters');
          current_header_thread=$('#datacenterheader');
          
          currentinfo($("#headertabledc"));
          
          updatecurrentdatacenters();
         
        }
       
        function showclusters()
        {
              reinitializebuttonpanel(false,false,false,true,true);
           if(current_header_thread != '')
          current_header_thread.css('display','none');   
            
          
          if(current_thread != '')
           current_thread.css('display','none');   
           
           current_thread=$('#currentclusters');
           current_header_thread=$('#clusterheader');
           currentinfo($("#headertablecs"));
           updatecurrentclusters();

            
        }
        function showhosts()
        {
              reinitializebuttonpanel(true,false,false,false,true);
               if(current_header_thread != '')
          current_header_thread.css('display','none');   
            
          if(current_thread != '')
            current_thread.css('display','none');     
           
           current_thread=$('#currenthosts');
           current_header_thread=$('#hostheader');
           currentinfo($("#headertablehs"));
           updatecurrenthosts();

        }
        function showstorage()
        {
              reinitializebuttonpanel(false,false,false,true,true);
             if(current_header_thread != '')
          current_header_thread.css('display','none');   
            
            
            
            if(current_thread != '')
            current_thread.css('display','none');  
          
           
           current_thread=$('#currentstorage');
            current_header_thread=$('#storageheader');
            currentinfo($("#headertablest"));
            updatecurrentstorage();
        }
        
        function showvms()
        {
              reinitializebuttonpanel(false,false,false,true,false);
            
             if(current_header_thread != '')
          current_header_thread.css('display','none');   
            
            
            if(current_thread != '')
            current_thread.css('display','none');  
          
           
           current_thread=$('#currentvms');
             current_header_thread=$('#vmheader');
           currentinfo($("#headertablevm"));
updatecurrentvms();
        }
        function showtemplates()
        {
              reinitializebuttonpanel(false,false,false,true,true);
             if(current_header_thread != '')
          current_header_thread.css('display','none');   
            
            
            if(current_thread != '')
            current_thread.css('display','none');  
          
           
           current_thread=$('#currenttemplates');
             current_header_thread=$('#templateheader');
           currentinfo($("#headertabletm"));
updatecurrenttemplates();
        }
        function showusers()
        {
              reinitializebuttonpanel(false,false,false,true,true);
            
             if(current_header_thread != '')
          current_header_thread.css('display','none');   
            
            
            if(current_thread != '')
            current_thread.css('display','none');  
          
            current_header_thread=$('#userheader');
           current_thread=$('#currentusers');
           
           currentinfo($("#headertableur"));
            updatecurrentusers();
        }
        
       function updatecurrentdatacenters(){
           
           
      //  setInterval(function(){document.getElementById("currentdatacenters").innerHTML=new Date().getSeconds()},1000);
       }
      function  updatecurrentclusters(){}
      function  updatecurrenthosts(){}
      function  updatecurrentstorage(){}
      function  updatecurrentvms(){}
      function  updatecurrenttemplates(){}
      function  updatecurrentusers(){}
        </script>
    </head>
    <body> 
        <div id="buttonpanel">
            <input type="button" value="New" id="newbtn"/>
            <input type="button" value="Remove" id="removebtn"/>
            <input type="button" value="Edit" id="editbtn"/>
            <input type="button" value="Approve" id="approvebtn"/>
             <input type="button" value="Console" id="consolebtn"/>
            
            
        </div>
        <br>
        <div id="controlpanel">
            
            
            <input type="button" value="DataCenters" id="datacentersbtn"/><br>
            <input type="button" value="Clusters" id="clustersbtn" /><br>
            <input type="button" value="Hosts" id="hostsbtn"/><br>
            <input type="button" value="Storage" id="storagebtn"/><br>
            <input type="button" value="VirtualMachines" id="vmsbtn"/><br>
            <input type="button" value="Templates" id="templatesbtn"/><br>
            <input type="button" value="Users" id="usersbtn"/><br>    
            
            
            
        </div>
        
        <div id="displayinfo">
            
         <div id="displayheaders">
             <div id="datacenterheader" style="display:none"><table id="headertabledc" ><tr><td style="padding-left:10px;padding-right:15px;border-right:3px solid">DataCenter Name</td><td style="padding-left:15px;padding-right:10px;border-right:3px solid">DataCenter Type</td><td style="padding-left:10px;padding-right:15px;border-right:3px solid">DataCenter Status</td><td style="padding-left:18px;padding-right:30px;">DataCenter Storage</td></table></div>    
            <div id="clusterheader" style="display:none"><table id="headertablecs" ><tr><td style="padding-left:35px;padding-right:15px;border-right:3px solid">Cluster Name</td><td style="padding-left:15px;padding-right:10px;border-right:3px solid">Cluster Status</td><td style="padding-left:10px;padding-right:15px;border-right:3px solid">Cluster Cpu Name</td><td style="padding-left:15px;padding-right:43px;">No Of Hosts Running</td></table></div>    
            <div id="hostheader" style="display:none"><table id="headertablehs" ><tr><td style="padding-left:35px;padding-right:15px;border-right:3px solid">Host Name</td><td style="padding-left:15px;padding-right:10px;border-right:3px solid">Host Status</td><td style="padding-left:10px;padding-right:15px;border-right:3px solid">Ip Address</td><td style="padding-left:15px;padding-right:15px;border-right:3px solid">Available Ram</td><td style="padding-left:10px;padding-right:6px;">No Of Vms Running</td></table></div>    
            <div id="storageheader" style="display:none"><table id="headertablest" ><tr><td style="padding-left:25px;padding-right:15px;border-right:3px solid">Storage Name</td><td style="padding-left:15px;padding-right:10px;border-right:3px solid">Storage Status</td><td style="padding-left:10px;padding-right:15px;border-right:3px solid">Domain Type</td><td style="padding-left:15px;padding-right:15px;border-right:3px solid">Protocol</td><td style="padding-left:16px;padding-right:35px;">Size Available</td></table></div>    
            <div id="vmheader" style="display:none"><table id="headertablevm" ><tr><td style="padding-left:20px;padding-right:15px;border-right:3px solid">VM Name</td><td style="padding-left:5px;padding-right:8px;border-right:3px solid">VM Status</td><td style="padding-left:10px;padding-right:15px;border-right:3px solid">VM User</td><td style="padding-left:15px;padding-right:15px;border-right:3px solid">Ram Allocated</td><td style="padding-left:20px;padding-right:40px;">Hard Disk Available</td></table></div>    
            <div id="templateheader" style="display:none"></div>    
            <div id="userheader" style="display:none"></div>    
           
         </div>        
                
             <div  id="currentdatacenters" style="display:none"></div>
            <div  id="currentclusters" style="display:none"></div>
            <div  id="currenthosts" style="display:none"></div>
            <div  id="currentstorage" style="display:none"></div>
            <div  id="currentvms" style="display:none"></div>
            <div  id="currenttemplates" style="display:none">template</div>
            <div  id="currentusers" style="display:none">user</div>
        </div>     
    
    
 
<br />

<form >
  <table border="0" id="form_datacenter" style="display:none;margin-top:200px;position:'absolute'">
      
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

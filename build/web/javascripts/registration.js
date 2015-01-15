$(document).ready(function(){
 $("input").focus(function () {
    $(this).css("border-color","blue"); 
   
   var ID=$(this).next("span").attr("id");
   if(ID == "fn")
       {
       document.getElementById("fn").innerHTML="Enter Your First Name";
        $(this).next("span").show("slow").css({"display":"inline","color":"black"});
        }
    else  if(ID == "ln")
       {
       document.getElementById("ln").innerHTML="Enter Your Last Name";
        $(this).next("span").show("slow").css({"display":"inline","color":"black"});
        }
    else  if(ID == "eid")
       {
       document.getElementById("eid").innerHTML="Enter Valid Email-Id ";
        $(this).next("span").show("slow").css({"display":"inline","color":"black"});
        }
        else  if(ID == "un")
       {
       document.getElementById("un").innerHTML="Enter Unique User Name";
        $(this).next("span").show("slow").css({"display":"inline","color":"black"});
        }
        else  if(ID == "pass")
       {
       document.getElementById("pass").innerHTML="More than 8 Characters long";
        $(this).next("span").show("slow").css({"display":"inline","color":"black"});
        }
        else  if(ID == "cn")
       {
       document.getElementById("cn").innerHTML="Enter Your Country Name";
        $(this).next("span").show("slow").css({"display":"inline","color":"black"});
        }
    else  if(ID == "cno")
       {
       document.getElementById("cno").innerHTML="Enter Your Contact Information";
        $(this).next("span").show("slow").css({"display":"inline","color":"black"});
        }
    else  if(ID == "con")
       {
       document.getElementById("con").innerHTML="Enter Your Company Name";
        $(this).next("span").show("slow").css({"display":"inline","color":"black"});
        }
        
    else  if(ID == "noe")
       {
       document.getElementById("noe").innerHTML=" No of Employees in Company";
        $(this).next("span").show("slow").css({"display":"inline","color":"black"});
        }
        
        
        
        
    
    
    
    });
  $("input").focusout(function () {
       $(this).css("border-color","#444");  
         
                 if($(this).val() == "")
             {
                 var ID=$(this).next("span").attr("id");
   if(ID == "fn")
       {
       document.getElementById("fn").innerHTML="Cannot Leave First Name Empty";
        $(this).next("span").show("slow").css({"display":"inline","color":"Orange"});
        }
    else  if(ID == "ln")
       {
       document.getElementById("ln").innerHTML="Cannot Leave Last Name Empty";
        $(this).next("span").show("slow").css({"display":"inline","color":"Orange"});
        }
    else  if(ID == "eid")
       {
       document.getElementById("eid").innerHTML="Email-Id cannot be Empty";
        $(this).next("span").show("slow").css({"display":"inline","color":"Orange"});
        }
        else  if(ID == "un")
       {
       document.getElementById("un").innerHTML=" User Name Cannot be Empty";
        $(this).next("span").show("slow").css({"display":"inline","color":"Orange"});
        }
        else  if(ID == "pass")
       {
       document.getElementById("pass").innerHTML="Password Cannot be Empty";
        $(this).next("span").show("slow").css({"display":"inline","color":"Orange"});
        }
        else  if(ID == "cn")
       {
       document.getElementById("cn").innerHTML="Country Name Cannot be Empty";
        $(this).next("span").show("slow").css({"display":"inline","color":"Orange"});
        }
    else  if(ID == "cno")
       {
       document.getElementById("cno").innerHTML="Contact No. Can't be Empty";
        $(this).next("span").show("slow").css({"display":"inline","color":"Orange"});
        }
        else  if(ID == "con")
       {
       document.getElementById("con").innerHTML="Company Name Missing??";
        $(this).next("span").show("slow").css({"display":"inline","color":"orange"});
        }
    
    else  if(ID == "noe")
       {
       document.getElementById("noe").innerHTML="Employee No. Missing??";
        $(this).next("span").show("slow").css({"display":"inline","color":"Orange"});
        }
        
                 
              
               }
             else
                 {
                     $(this).next("span").hide("fast");
                     
                     if($(this).attr("id") == "user_name")
                         {
                              
                           getUserNameValidate($(this).attr("value"),this);
       document.getElementById("un").innerHTML=getUserNameValidate($(this).attr("value"));;
        $(this).next("span").show("slow").css({"display":"inline","color":"White"});
                           
      
      
                               
                         
                         }
                 
                 
                 }
                  
             //document.getElementById("fn").innerHTML="trouble";
    });
    
    $("select").mousedown(function () {
        $(this).css("border-color","blue"); 
        var ID=$(this).next("span").attr("id");
   if(ID == "ut")
       {
       document.getElementById("ut").innerHTML="Enter the User Type";
        $(this).next("span").show("slow").css({"display":"inline","color":"black"});
        }
   
         
    });
     $("select").blur(function () {
         $(this).css("border-color","#444");
 if($(this).val() == "")
             {
                 var ID=$(this).next("span").attr("id");
   if(ID == "ut")
       {
       document.getElementById("ut").innerHTML="User Type Cannot Empty";
        $(this).next("span").show("slow").css({"display":"inline","color":"Orange"});
        }
         
             }
             else
                 {
                     $(this).next("span").hide("slow");
                 }
             
   });

var XMLHttpRequestObject = false; 

      if (window.XMLHttpRequest) {
        XMLHttpRequestObject = new XMLHttpRequest();
      } else if (window.ActiveXObject) {
        XMLHttpRequestObject = new ActiveXObject("Microsoft.XMLHTTP");
      }

      function getUserNameValidate(username,objthis)
      {
        var url = "http://localhost:8080/Cloud_Inception/UserNameValidate";

        if(XMLHttpRequestObject) {
          XMLHttpRequestObject.open("POST", url); 
          XMLHttpRequestObject.setRequestHeader('Content-Type', 
            'application/x-www-form-urlencoded'); 

          XMLHttpRequestObject.onreadystatechange = function() 
          { 
            if (XMLHttpRequestObject.readyState == 4 && 
              XMLHttpRequestObject.status == 200) {
              var resp=XMLHttpRequestObject.responseText;
             
             document.getElementById("un").innerHTML=resp;
        $(thisobj).next("span").show("slow").css({"display":"inline","color":"White"});
       
              /*document.getElementById("un").innerHTML=resp;
       document.getElementById("un").show("slow").css({"display":"inline","color":"white"});        */
         
              
            } 
          } 

          XMLHttpRequestObject.send("username=" + username);
          

        }
      }

























































































































});
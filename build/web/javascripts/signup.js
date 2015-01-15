/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){
//open popup
$("#pop").click(function(){
  
  $("#form_table").fadeIn(800);
  positionPopup();
  $("#bodid").css({
  background : 'darkgray'
  });
  
});

//close popup
});

//position the popup at the center of the page
function positionPopup(){
  if(!$("#form_table").is(':visible')){
    return;
  }
  $("#form_table").css({
      left: ($(window).width() - $('#form_table').width()) / 2,
      top: ($(window).width() - $('#form_table').width()) / 40,
      position:'absolute'
  });
  
  
  
  $("#close").click(function(){
       
          $("#form_table").fadeOut(500);
          
     $("#bod").css({background : 'white'});   
});
}


//maintain the popup at center of the page when browser resized
$(window).bind('resize',positionPopup);

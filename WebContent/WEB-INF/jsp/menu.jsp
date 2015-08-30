<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta charset='utf-8'>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="css/styles.css"></link>   
   <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
   <script>
   ( function( $ ) {
	   $( document ).ready(function() {
	   $('#cssmenu > ul > li > a').click(function() {
	     $('#cssmenu li').removeClass('active');
	     $(this).closest('li').addClass('active');	
	     var checkElement = $(this).next();
	     if((checkElement.is('ul')) && (checkElement.is(':visible'))) {
	       $(this).closest('li').removeClass('active');
	       checkElement.slideUp('normal');
	     }
	     if((checkElement.is('ul')) && (!checkElement.is(':visible'))) {
	       $('#cssmenu ul ul:visible').slideUp('normal');
	       checkElement.slideDown('normal');
	     }
	     if($(this).closest('li').find('ul').children().length == 0) {
	       return true;
	     } else {
	       return false;	
	     }		
	   });
	   });
	   } )( jQuery );    
   </script>
   <title>CSS MenuMaker</title>
</head>
<body>
<div id='cssmenu'>
<ul>
   <li class='active'><a href='#'><span>Home</span></a></li>
   <li class='has-sub'><a href='#'><span>HR Corner</span></a>
      <ul>
         <li><a href="addnewcandidate.html"><span>Add new Candidate</span></a></li>
         <li><a href="assigninterviewer.html"><span>Assign Interviewer</span></a></li>
      </ul>
   </li>   
      <li class='has-sub'><a href='#'><span>Interviewer</span></a>
      <ul>
         <li><a href="interviewerhome.html"><span>InterviewerHome</span></a></li>         
      </ul>
   </li>   
   <li class='last'><a href="candidatehome.html"><span>CandidateHome</span></a></li>
</ul>
</div>
</body>
</html>







<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Sample Template</title>
<!--[if IE]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><!--[endif]-->
<link rel="stylesheet" type="text/css" href="css/202.css" />
 
<link href="http://mottie.github.io/tablesorter/css/theme.default.css" rel="stylesheet">
<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.9.1/jquery.tablesorter.min.js"></script>
<script type="text/javascript" src="https://www.google.com/jsapi?autoload={'modules':[{'name':'visualization','version':'1','packages':['corechart']}]}"></script>
<script type="text/javascript"></script>
<script type="text/javascript" src="jquery-1.9.1.min.js">
</script>
<style>
html, body, div, span, applet, object, iframe,
h1, h2, h3, h4, h5, h6, p, blockquote, pre,
a, abbr, acronym, address, big, cite, code,
del, dfn, em, img, ins, kbd, q, s, samp,
small, strike, strong, sub, sup, tt, var,
b, u, i, center,
dl, dt, dd, ol, ul, li,
fieldset, form, label, legend,
table, caption, tbody, tfoot, thead, tr, th, td,
article, aside, canvas, details, embed,
figure, figcaption, footer, header, hgroup,
menu, nav, output, ruby, section, summary,
time, mark, audio, video {
margin: 0;
padding: 0;
border: 0;
font-size: 100%;
font: inherit;
vertical-align: baseline;
}
/* HTML5 display-role reset for older browsers */
article, aside, details, figcaption, figure,
footer, header, hgroup, menu, nav, section {
display: block;
}
body {
line-height: 1;
}
ol, ul {
list-style: none;
}
blockquote, q {
quotes: none;
}
blockquote:before, blockquote:after,
q:before, q:after {
content: '';
content: none;
}
table {
border-collapse: collapse;
border-spacing: 0;
}
body {
    font-family: Verdana, Arial, Helvetica, sans-serif;
    font-size: 13px;
    color:#333;
    background-repeat: no-repeat;
    background-size: 1370px 1000px;
}
input:hover { 
    background-color: #00BFFF;
}
 
p {
    padding: 10px;
}
#wrapper {
    margin: 0 auto;
    width: 100%;
    border: 1px solid black;
}
#headerwrap {
    width: 100%;
    float: left;
    margin: 0 auto;
    border: 2px solid black;
    background-color: #FFFFFF;
    border-radius : 5px;
}
#header {
    height: 100px; 
    border-radius: 10px;
    border: 1px solid black;
    background-color: #000000;
    margin: 5px;    
    opacity: 0.6;
}
#menubar {
    width: 100%;
    float: left;
    margin: 0 auto;
    height: 40px;
    background-color: #FFFFCC;
    border: 2px solid black;    
    border-radius: 5px;
}
 
#contentwrap {
    width: 100%;
    float: left;
    margin: 0 auto;
    height: 700px;
    border-radius: 5px;
    border: 2px solid black;    
}
#content {
    border-radius: 10px;
    border: 1px solid black;
    margin: 5px;
    height: 625px;
    opacity: 0.9;
}
#content2 {    
    border-radius: 10px;
    border: 1px solid #e69feb;
    margin: 5px;
    height: 390px;
    background: rgba(100, 100, 175, .5);
    border: 1px solid black;    
}
#footerwrap {
    width: 100%;
    float: left;    
    margin: 0 auto;
    clear: both;
    border: 1px solid black;
    background-color: #FFFFFF;
    position : relative;
        }
#footer {
    height: 33px;
    background-color: #000000;
    border-radius: 10px;
    border: 1px solid black;
    margin: 5px;
    padding: 10px 5px 5px 5px;
    float:center;
    opacity:0.6;
}
#top-left{
border: 1px solid black;
height: 610px;
width: 99%;
border-radius: 3px;
padding: 10px 5px 5px 5px;
background-color : #505050;
}
#top-right{
border: 1px solid black;
height: 290px;
position: relative;
background-color : #505050;
top:-307px;
float: right;
width: 49%;
border-radius: 5px;
padding: 10px 5px 5px 5px;
}
#bottom-left{
border: 1px solid black;
height: 300px;
 
float : left;
width: 49%;
position:relative; 
top: 1px;
border-radius: 5px;
padding: 10px 5px 5px 5px;
}
#bottom-right{
border: 1px solid black;
height: 300px;
position: relative;
float: right;
background-color : #505050;
top:-306px;
width: 49%;
border-radius: 5px;
padding: 10px 5px 5px 5px;
}
#blink {
text-align:center;
background:#0000000;
color:#F00;
margin: 0;
padding:20px;
}
 
#blink span {
font-size:2em;
font-weight:bold;
display:block;
}
 
 
.button {
   border-top: 1px solid #96d1f8;
   background: #5d89a6;
   background: -webkit-gradient(linear, left top, left bottom, from(#153042), to(#5d89a6));
   background: -webkit-linear-gradient(top, #153042, #5d89a6);
   background: -moz-linear-gradient(top, #153042, #5d89a6);
   background: -ms-linear-gradient(top, #153042, #5d89a6);
   background: -o-linear-gradient(top, #153042, #5d89a6);
   padding: 6.5px 13px;
   -webkit-border-radius: 22px;
   -moz-border-radius: 22px;
   border-radius: 22px;
   -webkit-box-shadow: rgba(0,0,0,1) 0 1px 0;
   -moz-box-shadow: rgba(0,0,0,1) 0 1px 0;
   box-shadow: rgba(0,0,0,1) 0 1px 0;
   text-shadow: rgba(0,0,0,.4) 0 1px 0;
   color: white;
   font-size: 13px;
   font-family: Georgia, serif;
   text-decoration: none;
   vertical-align: middle;
   }
.button:hover {
   border-top-color: #28597a;
   background: #28597a;
   color: #ccc;
   }
.button:active {
   border-top-color: #1b435e;
   background: #1b435e;
   }
.buttonend {
   border-top: 1px solid #96d1f8;
   background: #5d89a6;
   background: -webkit-gradient(linear, left top, left bottom, from(#153042), to(#5d89a6));
   background: -webkit-linear-gradient(top, #153042, #5d89a6);
   background: -moz-linear-gradient(top, #153042, #5d89a6);
   background: -ms-linear-gradient(top, #153042, #5d89a6);
   background: -o-linear-gradient(top, #153042, #5d89a6);
   padding: 5px 10px;
   -webkit-border-radius: 4px;
   -moz-border-radius: 4px;
   border-radius: 4px;
   -webkit-box-shadow: rgba(0,0,0,1) 0 1px 0;
   -moz-box-shadow: rgba(0,0,0,1) 0 1px 0;
   box-shadow: rgba(0,0,0,1) 0 1px 0;
   text-shadow: rgba(0,0,0,.4) 0 1px 0;
   color: white;
   font-size: 11px;
   font-family: Georgia, serif;
   text-decoration: none;
   vertical-align: middle;
   }
.buttonend:hover {
   border-top-color: #28597a;
   background: #28597a;
   color: #ccc;
   }
.buttonend:active {
   border-top-color: #1b435e;
   background: #1b435e;
   }
</style> 
</head>
<body>
    <div id="wrapper">
        <div id="headerwrap">
       <div id="header">
        <p style="font-size: 70px; text-align:center; font-family:Parkavenue cursive;text-shadow: 4px 4px #000000;color:#FFFFFF">VZ Walkin Management System</p>
      </div>
        </div>
        <div id="menubar">
        <p style="font-size: 20px; text-align:center; font-family:Arial;color:#000000">Login Screen</p>
        </div>
         <div id="contentwrap">
        <div id="content" height="20%">
            <div id="top-left">
			<div id="content">
            <table align="center" style="position:absolute;left: 40%;top:45%">
            <tr>
            <form action="loginAction" method="post">  
            <td><label style="color:#FFFFFF">Name</label></td><td><input type="text" name="nameValue" size="30"/></td>
            </tr>         
            <tr style="position:absolute;right:0%;top:125%">
            <td><label style="color:#FFFFFF">Password</label></td><td><input type="password" name="password" maxlength="5" size="30"/></td>
            </tr> 
            </table>
            <table align="center" style="position:absolute;left: 49%;top:55%;padding-top:40px">
            <tr style="position:absolute;left: 30%">
            <td>
            <input type="submit" value="Login" size="50"/>
            </td>
            </tr> 
            </form>
            </table>
        </div>
        
        </div>
       <!-- <div id="top-right">
        </div>-->
        <!--<div id="bottom-left">
         <table id="myDummyTable" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
      <thead>
        <tr>
          <th>Name</th>
          <th>Age</th>      
          <th>Sex</th>
          <th>City</th>
          <th>Joining Date</th>
          <th>Computer IP</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>Jadu</td>
          <td>24</td>
          <td>M</td>
          <td>Kolkata</td>
          <td>Feb 28, 2012</td>
          <td>169.254.23.75</td>
        </tr>
        <tr>
          <td>Madhu</td>
          <td>32</td>
          <td>F</td>
          <td>Delhi</td>
          <td>Jan 10, 2011</td>
          <td>169.254.23.23</td>
        </tr>
        <tr>
          <td>John</td>
          <td>27</td>
          <td>M</td>
          <td>Banglore</td>
          <td>Mar 17, 2010</td>
          <td>169.254.77.89</td>
        </tr>
        <tr>
          <td>Rahim</td>
          <td>43</td>
          <td>M</td>
          <td>Noida</td>
          <td>Dec 29, 2009</td>
          <td>169.254.85.88</td>
        </tr>
        <tr>
          <td>Rita</td>
          <td>37</td>
          <td>F</td>
          <td>Hydrabad</td>
          <td>Aug 16, 2011</td>
          <td>169.254.65.19</td>
        </tr>
        <tr>
          <td>Washim</td>
          <td>24</td>
          <td>M</td>
          <td>Mumbai</td>
          <td>Sep 29, 2012</td>
          <td>169.254.28.92</td>
        </tr>
        <tr>
          <td>Washim</td>
          <td>24</td>
          <td>M</td>
          <td>Mumbai</td>
          <td>Sep 29, 2012</td>
          <td>169.254.28.92</td>
        </tr>
        <tr>
          <td>Washim</td>
          <td>24</td>
          <td>M</td>
          <td>Mumbai</td>
          <td>Sep 29, 2012</td>
          <td>169.254.28.92</td>
        </tr>
        <tr>
          <td>Washim</td>
          <td>24</td>
          <td>M</td>
          <td>Mumbai</td>
          <td>Sep 29, 2012</td>
          <td>169.254.28.92</td>
        </tr>
         
       </tbody>
    </table>
        </div>-->
        <!--<div id="bottom-right">
        <div id="blink"><span>Blinking Text</span></div>
        </div>    -->    
             
            </div>    
         
        <div id="footerwrap">
        <div id="footer">
<!--<div style="position:absolute;left:590px">          
  <input type="button" class="button" value="continue">
  <input type="button" class="button" value="Terminate">
  <div style="position:relative;top:-30px;left:550px">
  <input type="button" class="buttonend" value="1">
  <input type="button" class="buttonend" value="2">
  <input type="button" class="buttonend" value="3">
  <input type="button" class="buttonend" value="4">
  <input type="button" class="buttonend" value="5">
  </div>
 </div>-->
        </div>
        </div>
    </div>
</body>
</html>


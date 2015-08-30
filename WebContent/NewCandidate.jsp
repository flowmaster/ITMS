<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="//a.fsdn.com/con/css/sf.css?1440602718" type="text/css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Candidate</title>
</head>
<body>
<div id="page-body">
<div id="register">
    <h2>Add Candidate</h2>
    <form method="post" action="/flowmaster/addcandidate">
        
        <p>
            <label>
                Job Id:          
                <select id="jobid" name="XDNdvRN2bGsIdfNUhAIJqfsGhvgc" required>
               		<option value="PM263">Select</option>
                    <option value="PM263">PM263</option>
                    <option value="SE236">SE236</option>
                    <option value="SA484">SA484</option>
                    <option value="SS235">SS235</option>
                    <option value="TL276">TL276</option>
                    <option value="PM2423">PM2423</option>
                    <option value="SE2336">SE2336</option>
                    <option value="SA4674">SA4674</option>
                    <option value="SS2385">SS2385</option>
                    <option value="TL0276">TL0276</option>
                    <option value="PM26133">PM26133</option>
                    <option value="SE24536">PM26133</option>
                    <option value="SA48784">SA48784</option>
                    <option value="SS23655">SA48784</option>
                    <option value="TL26576">TL26576</option>
                </select>
            </label>
            <span class="fielderror"></span>
        </p>
        </fieldset>
        <fieldset id="candidate-info">
            <p>
                <label>Candidate Name: 
                <input name="XD9phXNbqXjQM6w2OrCwxOb41jVI" type="text" value="" placeholder="Full name" title="We try to use your name whenever possible; however, there are some times when we display your username instead." required>
                </label>
                <span class="fielderror"></span>
            </p>
        </fieldset>
        <fieldset id = "skillset">
            <p>
            <label>
                    Skill Sets :
            <input name="XDttwRdqBbY2XXvtiGtgok3LHgPg" type="checkbox" value="java" > Java Technology </p>
            <p><input name="XDttwRdqBbY2XXvtiGtgok3LHgPg" type="checkbox" value=".net" > .NET </p>
            <p> <input name="XDttwRdqBbY2XXvtiGtgok3LHgPg" type="checkbox" value="web" > Web Technology</p>
            <p><input name="XDttwRdqBbY2XXvtiGtgok3LHgPg" type="checkbox" value="c" > C Programming</p>
            </label>
            <p class="fielderror"></p>
        </fieldset>
        <fieldset id = "interviewer">    
            <p>
                <label>Username:<input id="username" name="XA8FzVMGBCdZ9T2y6tXSGyDW4FMs" type="text" value="" placeholder="Only lowercase letters, numbers, or dashes" required maxlength=15></label>
                <span id="username-error" class="fielderror"></span>
            </p>
            <p>
                <label>Password: <input id="password" name="XA8RhQsCYB8l8T2y6tXSGyDW4FMs" type="password" placeholder="Minimum of 10 chars" value="" required></label>
                <span id="password-error" class="fielderror"></span>
            </p>
            <p>
                <label>Confirm Password: <input id="password_confirm" name="XG8RhQsCYB8l8FTlaz7O4AVVEwg4" type="password" placeholder="Enter password again" value="" required></label>
                <span id="password-confirm-error" class="fielderror"></span>
            </p>
        </fieldset>
        <fieldset id="work-info">
            <legend>Work Information</legend>
            <p>
                <label>
                    Job Title:
                    <select name="XCN5vU7bZ56:5HeE4WDWb9Uw4J:8" required>
                        <option value="" selected></option>
                        <option value="CEO, COO, Chairman, President">CEO, COO, Chairman, President</option>
                        <option value="CFO, Controller, Treasurer">CFO, Controller, Treasurer</option>
                        <option value="CIO, CTO, CSO">CIO, CTO, CSO</option>
                        <option value="VP (IT)">VP (IT)</option>
                        <option value="Executive VP, Senior VP (IT)">Executive VP, Senior VP (IT)</option>
                        <option value="Director (IT)">Director (IT)</option>
                        <option value="Manager/Supervisor (IT)">Manager/Supervisor (IT)</option>
                        <option value="Executive VP, Senior VP, VP, GM (Business Management)">Executive VP, Senior VP, VP, GM (Business Management)</option>
                        <option value="Director, Manager (Business Management)">Director, Manager (Business Management)</option>
                        <option value="IT/Software Developer">IT/Software Developer</option>
                        <option value="IT Staff">IT Staff</option>
                        <option value="Other Corporate, Business Manager">Other Corporate, Business Manager</option>
                        <option value="Other: Non-Manager/Student/Retired">Other: Non-Manager/Student/Retired</option>
                        <option value="Systems Integrator">Systems Integrator</option>
                        <option value="Non-Technical Consultant">Non-Technical Consultant</option>
                        <option value="Technical Consultant">Technical Consultant</option>
                        <option value="Student/Retired">Student/Retired</option>
                        <option value="Other/Undisclosed">Other/Undisclosed</option>
                    </select>
                </label>
                <span class="fielderror"></span>
            </p>
            <p>
                <label>
                    Number of Employees:
                    <select name="XAtFtQd:AEd59OV8DLsFwJINMDWE" required>
                        <option value="" selected></option>
                        <option value="Less than 50">Less than 50</option>
                        <option value="50 - 99">50 - 99</option>
                        <option value="100 - 499">100 - 499</option>
                        <option value="500 - 999">500 - 999</option>
                        <option value="1,000 - 4,999">1,000 - 4,999</option>
                        <option value="5,000 - 9,999">5,000 - 9,999</option>
                        <option value="10,000 - 19,999">10,000 - 19,999</option>
                        <option value="20,000 or More">20,000 or More</option>
                    </select>
                </label>
                <span class="fielderror"></span>
            </p>
        </fieldset>
        <fieldset id="optin">
            <legend>Opt In</legend>
            <label><input name="XDttwRdqBbY2XXvtiGtgok3LHgPg" type="checkbox" value="allmailings" > Receive newsletters and notices that include site news, project updates, sponsored content from our select partners and more.</label>
            <p class="fielderror"></p>
        </fieldset>
        <input type="hidden" name="_visit_cookie" value="55ded1715228cb5d60a753ed"/>
        <input type='hidden' name='timestamp' value='1440665981'/>
        <input type='hidden' name='spinner' value='XC7QAMbPvaLsYSlo1odXRczhB9IE'/>
        <p class='f66c684a39745a2aca263e9609cf7393272ac3c3f'><label for='XDNxvX9aWWIsdfNUhAIJqfsGhvgc'>You seem to have CSS turned off. Please don't fill out this field.</label><input id='XDNxvX9aWWIsdfNUhAIJqfsGhvgc' name='XDdxvX9aWWL4uxU6U9m7citgLcvU' type='text'/></p>
        <p class='f66c684a39745a2aca263e9609cf7393272ac3c3f'><label for='XDNxvX9aWWIodfNUhAIJqfsGhvgc'>You seem to have CSS turned off. Please don't fill out this field.</label><input id='XDNxvX9aWWIodfNUhAIJqfsGhvgc' name='XDdxvX9aWWb4uxU6U9m7citgLcvU' type='text'/></p>
        
        <p id="tos">By clicking on "Register" below, you are agreeing to the <a href="http://slashdotmedia.com/terms-of-use/">Terms of Use</a> and the <a href="http://slashdotmedia.com/privacy-statement/">Privacy Policy</a>.</p>
        <fieldset id="actions">
            <p>
                <input type="submit" value="Register">
           
    
</div>

        </div>
        
</body>
</html>
<!doctype html>

<head>
    <title>Join us now!</title>
    <link rel="stylesheet" type="text/css" href="css/normalize.css">
    <link rel="stylesheet" type="text/css" href="css/newregister.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
    <script src="js/register.js" type="text/javascript"></script>
    <meta charset="utf-8"/>
</head>
<body>
    <div class="search">
        <form action="Search" method="GET">
            <input type="text" id= "search_text" name="search" placeholder="Search images">
            <input type="submit" value = "" id ="search_button">
        </form>
    </div>
    <nav>
        <ul>
            <li><a href="new-home.jsp"><img src="css/images/home-icon.png"></a></li>
            <li><a href="register.jsp">Register</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="explore.jsp">Explore</a></li>
        </ul>

    </nav>
    <main>
        <form id="register" action="Register" method="post">         
            <table>
                <tr>
                    <td>   
                        <h3>Create your Photics account</h3>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="firstname" placeholder="First name" class = "fname" id="fname" required>
                        <input type="text" name="lastname"  placeholder="Last name" class = "lname" id ="lname" required>
                    </td>
                <tr>
                    <td>
                        <input type="email" name="email" placeholder="Email" id="email" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input class="newpassword" id="newpassword" type="password" name="password" onkeyup= "checkPasswordMatch();" required placeholder="Password">
                    </td>   
                </tr>
                <tr>        
                    <td>
                        <input  class="newconfirmpassword" id="newconfirmpassword" type="password" name="repassword" onkeyup="checkPasswordMatch();"  required placeholder="Re-enter password">            
                        <span id="noti"></span>
                    </td>       
                </tr>

                <tr>  
                    <td>
                        <input type="checkbox" name="accept" id="accept"><label for="test1"></label>
                        I agree to the Photics 
                        <a href="term.html" id="term">Privacy Policy</a></label>
                    </td>   
                </tr>
                <tr>     
                    <td>
                        <input name="submit" type="submit"  value="Submit" class="submit-button">
                    </td>  
                    <td>
                        <div class="note">Already have an account?<a href="login.jsp"> Sign in!</a></div>
                    </td>                      
                </tr>
            </table> 
        </form>
    </main>
</body>
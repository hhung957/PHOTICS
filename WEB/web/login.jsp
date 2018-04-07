<!doctype html>
<head>
    <title>Join us now!</title>
    <link rel="stylesheet" type="text/css" href="css/normalize.css">
    <link rel="stylesheet" type="text/css" href="css/newlogin.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/forget.js"></script>  
    <script type="text/javascript" src="js/login.js"></script>  
</head>
<body>
    <div class="search">
        <input type="text" id= "search_text" name="search" placeholder="Find friends or images">
        <input type="button" name = "search_button" id ="search_button">
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
        <form action="Login" method="post">                       
            <table>
                <tr>  
                    <td><h3>Login to your Photics account</h3></td>
                </tr>

                <tr>

                    <td>
                        <input type="email" name="email" placeholder="Email" id="email" required>
                    </td>   
                </tr>
                <tr>

                    <td>
                        <input type="password" name="password" placeholder="Password" id="password" required>
                    </td>   
                </tr>                       
                <tr>  
                    <td>
                        <input name="submit" type="submit" value ="Login" class="submit-button">
                    </td>  
                </tr>

            </table>
        </form>

        <div class="note">
            <a class="forget-password"> Forget your password?</a>
            <div class="forget-menu">
                <div class="forget-menu-content">
                    <span class="close1">&times;</span>
                    <h1>Just one step to get your password!</h1>
                    <h4>We will send you your password via your email</h4>
                    <h3>Enter your email:</h3>
                    <form action="Forgot" method="POST">
                        <input type="email" placeholder="Your Photics email" name="email">
                        <input type="submit" value="Submit">
                    </form>
                </div>
            </div>
        </div>
    </main>       
</body>


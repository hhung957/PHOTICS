<!doctype html>
<head>
    <title>Join us now!</title>
    <link rel="stylesheet" type="text/css" href="css/normalize.css">
    <link rel="stylesheet" type="text/css" href="css/newhome.css">

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
                    <%
                        String login = (String) session.getAttribute("login");
                        if (login == "login") {
                    %>
            <li>Hello! <a href="user.jsp">${sessionScope.email}</a></li>
            <li><a href="register.jsp" style="visibility:hidden ">Register</a></li>
            <li><a href="login.jsp" style="visibility:hidden ">Login</a></li>
            <li><a href="#top" style="visibility:hidden">Explore</a></li>
                <%
                } else {
                %>
            <li><a href="register.jsp">Register</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="explore.jsp">Explore</a></li>
                <%
                    }
                %>
        </ul>

    </nav>
    <main>
        <h1>Photics</h1>
    </main>

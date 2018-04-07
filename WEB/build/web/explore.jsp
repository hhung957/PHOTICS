<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<head>
    <title>Join us now!</title>
    <meta charset="utf-8"/>
    <link rel="stylesheet" type="text/css" href="css/newexplore.css">
    <link rel="stylesheet" type="text/css" href="css/lightbox.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/editModal.js"></script>
    <script type="text/javascript" src="js/lightbox.js"></script> 
    <script type="text/javascript" src="js/lightbox-plus-jquery.js"></script>   
</head>
<body>
    <div class="search">
        <form action="Search" method="GET">      
            <input type="submit" name = "search_button" id ="search_button">
            <input type="text" id= "search_text" name="search" placeholder="Find friends or images">
            <input type="button" id="filter" class="drop" >
            <label for="filter"><img src="css/images/icon-filter.png"></label>
        </form>
        <div class="modal-filter">
            <div class="modal-filter-content"> 
                <span class="close1">&times;</span>
                <form action="SearchA" method="GET">
                    <h3>Search by caption</h3>
                    <input type="text" name="caption">
                    <h3>Search by category</h3>
                    <select name="category">
                        <option value="animal">Animal</option>
                        <option value="potrait">Potrait</option>
                        <option value="landscape">Landspace</option>
                        <option value="sport">Sport</option>
                        <option value="other">Other</option>
                    </select>
                    <input type="submit" value="Search">
                </form>
            </div>
        </div>

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
            <li><a href="explore.jsp" style="visibility:hidden">Explore</a></li>
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
    <div class='wrapper'>
        <sql:setDataSource var = "database" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/photics" 
                           user="root" password=""/>
        <sql:query dataSource="${database}" sql="SELECT * from image WHERE NOT email = '${sessionScope.email}' ORDER BY RAND()" var="result"/>
        <c:forEach var="row" items="${result.rows}">
            <a href="${pageContext.servletContext.contextPath}/upload?ID=${row.ID}" data-lightbox="wrapper" data-title="${row.caption} by ${row.email}">
                <img  src="${pageContext.servletContext.contextPath}/upload?ID=${row.ID}" alt=${row.ID}/> 
            </a>
        </c:forEach>
    </div>

    <footer>
        <div class="filter">
            <p class="animals">
                <a href="animal.jsp">Animals</a>
            </p>
            <p class="nature">
                <a href="portrait.jsp">Portrait</a>
            </p>
            <p class="food">
                <a href="landscape.jsp">Landscape</a>
            </p>
            <p class="fashion">
                <a href="sport.jsp">Sport</a>
            </p>
            <p class="art">
                <a href="other.jsp">Other</a>
            </p>

        </div>
    </footer>
</body>
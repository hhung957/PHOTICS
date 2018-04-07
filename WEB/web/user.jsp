<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<html>
    <head>
        <meta charset="utf-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="css/normalize.css">
        <link rel="stylesheet" type="text/css" href="css/test.css">
        <link rel="stylesheet" type="text/css" href="css/lightbox.css">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="js/editModal.js"></script>
        <script type="text/javascript" src="js/drop-drag.js"></script>
        <script type="text/javascript" src="js/dropdown.js"></script>
        <script type="text/javascript" src="js/lightbox.js"></script> 
        <script type="text/javascript" src="js/lightbox-plus-jquery.js"></script>
        <script type="text/javascript" src="js/editAvatar.js"></script> 
        <script type="text/javascript" src="js/previewAvatar.js"></script> 
        <script type="text/javascript" src="js/register.js"></script> 
    </head>

    <body>
        <nav class="tabs">
            <div class="tab">
                <input type="radio" id="tab-1" name="tab-group-1">
                <label for="tab-1"><img src="images/icon-menu.png" width=25px></label>
                <div class="tab close-tab">
                    <input type="radio" id="tab-close" name="tab-group-1">
                    <label for="tab-close"><img src="images/icon-menu.png" width=25px></label>
                </div>
                <div class="content">
                    <ul>
                        <li><a href="new-home.jsp"><img src="images/icon-home.png"><p>Home</p></a></li>
                        <li><a href="explore.jsp"><img src="images/icon-explore.png"><p>Explore</p></a></li>
                        <li><a class="password"><img src="images/icon-setting.png"><p>Password</p></a></li>
                        <li><a href="Login"><img src="images/icon-logout.png"><p>Logout</p></a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="hey">

        </div>

        <div class="main">    
            <form action="Search" method="GET" class="outside">

                <input type="submit" name = "search_button" id ="search_button">
                <input type="text" id= "search_text" name="search" placeholder="Find images">
                <input type="button" id="filter" class="drop" >
                <label for="filter"><img src="css/images/icon-filter.png"></label>
            </form>
            <div class="modal-password">
                <div class="modal-password-content"> 
                    <span class="close1">&times;</span>
                    <h2>Change your current password</h2>
                    <form id="change" action="Editpass" method="POST">
                        <h4>Your current password:</h4>
                        <input id="oldpassword" type="password" name="password" >
                        <br>
                        <div class="new-password">
                            <h4>Your new password:</h4>
                            <input id="newpassword" type="password" name="newpassword" onkeyup= "checkPasswordMatch();">

                        </div>

                        <div class="new-password1"> 
                            <h4>Confirm your new password:</h4>
                            <input id="newconfirmpassword" type="password" name="renewpass" onkeyup="checkPasswordMatch();" >
                            <span id="noti"></span>

                        </div>
                        <input type="submit" value="Confirm">
                    </form>
                </div>
            </div>

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
            <!--            </div>-->


            <div class="add">
                <button id="myBtn"></button>         
                <label for="myBtn"><img src="css/images/icon-add.png"><p>Upload photos</p></label>
                <p>Upload photos</p>
                <!-- The Modal -->
                <div id="myModal" class="modal">                       
                    <!-- Modal content -->
                    <div class="modal-content">
                        <span class="close">&times;</span>

                        <div id="wrapper">
                            <h1>Upload your image</h1>
                            <form action="upload" method="POST" enctype="multipart/form-data">
                                <div class="flex">

                                    <!-- <h3>Select an image</h3> -->
                                    <input id="file" name="myimg" type="file" accept="image/*" onchange="preview_image(event)" style="visibility:hidden;">
                                    <label for="file" class="btn"><strong>Select An Image</strong></label>
                                    <img id="output_image" >
                                    <div class="flex1">
                                        <h3>Your caption:</h3>
                                        <textarea rows="4" cols="50" name="caption">
                                                
                                        </textarea>

                                        <h3>Choose category</h3>
                                        <select name="category">
                                            <option value="animal">Animal</option>
                                            <option value="portrait">Portrait</option>
                                            <option value="landscape">Landscape</option>
                                            <option value="sport">Sport</option>
                                            <option value="other">Other</option>
                                        </select>
                                        <input type="submit" value="Upload" id="upload" >
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>     
                </div>                             
            </div>  
        </div>



        <div class="sub">
            <div class="cover">
                <div class="avatar-modal" id="id01">

                    <form id="form1" class="avatar-form" action="avatar" method="POST" enctype="multipart/form-data">
                        <h2>Change your profile picture</h2>
                        <span class="close1">&times;</span>
                        <input class="hinhnen" type="file" onchange="previewFile()" name="myavatar"><br>
                        <img class="avatar-preview" src="http://via.placeholder.com/300x300" height="300px" width="300px">
                        <input type="submit" value="Change" class="avatar-submit">
                    </form>
                </div>
            </div>
            <div class="cover">
                <div class="avatar">
                    <span>
                        <p class="update">Update</p>
                    </span>
                    <sql:setDataSource var = "database" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/photics" 
                                       user="root" password=""/>
                    <sql:query dataSource="${database}" sql="SELECT * FROM user WHERE email ='${sessionScope.email}'" var="result"/>
                    <c:forEach var="row" items="${result.rows}">
                        <img src="${pageContext.servletContext.contextPath}/avatar?email=${row.email}" alt="${row.email}"/>
                    </c:forEach>
                </div>


            </div>
            <div class="profile">
                <div  class="follower">

                    <p name="name">${sessionScope.email}</p>

                </div>

                <div class="wrapper">
                    <sql:setDataSource var = "database" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/photics" 
                                       user="root" password=""/>
                    <sql:query dataSource="${database}" sql="SELECT * FROM image INNER JOIN user ON image.email = user.email WHERE user.email ='${sessionScope.email}' ORDER BY ID DESC" var="result"/>
                    <c:forEach var="row" items="${result.rows}">
                        <a href="${pageContext.servletContext.contextPath}/upload?ID=${row.ID}" data-lightbox="wrapper" data-title="${row.caption}"> 
                            <img  src="${pageContext.servletContext.contextPath}/upload?ID=${row.ID}" alt=${row.ID}/> 
                        </a>
                    </c:forEach>
                </div>
                <div class="inf">       
                    <div class="first">
                        <sql:setDataSource var = "database" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/photics" 
                                           user="root" password=""/>
                        <sql:query dataSource="${database}" sql="SELECT * FROM user WHERE email ='${sessionScope.email}'" var="result"/>
                        <c:forEach var="row" items="${result.rows}">
                            <img src="${pageContext.servletContext.contextPath}/avatar?email=${row.email}" alt="${row.email}"/>
                        </c:forEach>
                        <h6>${sessionScope.email}</h6>

                    </div>     
                    <div class="second">         
                        <sql:setDataSource var = "database" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/photics" 
                                           user="root" password=""/>
                        <sql:query dataSource="${database}" sql="SELECT * FROM image INNER JOIN user ON image.email = user.email WHERE user.email ='${sessionScope.email}' ORDER BY ID DESC" var="result"/>
                        <c:forEach var="row" items="${result.rows}">
                            <div class = "new-post">
                                <p>${row.caption}</p>
                                <div id="post-${row.ID}">
                                    <a href="${pageContext.servletContext.contextPath}/upload?ID=${row.ID}" data-lightbox="wrapper" data-title="${row.caption}"> 
                                        <img  src="${pageContext.servletContext.contextPath}/upload?ID=${row.ID}" alt=${row.ID}/> 
                                    </a>
                                    <div class="dropdown">
                                        <button id="${row.ID}"
                                                class="dropbtn">
                                            <img src ="css/images/icon-more.png" alt="more">
                                        </button>

                                        <div id="myDropdown" class="dropdown-content" > 
                                            <a href="Delete?ID=${row.ID}" class="delete" onclick="if (!confirm('Do you really want to delete this picture?'))
                                                        return false">Delete</a>
                                            <div id="modal-${row.ID}">
                                                <a class="myBtn" id="${row.ID}">Edit</a>
                                                <div id="myModal-${row.ID}" class="modal-new ">                       
                                                    <!-- Modal content -->
                                                    <div class="modal-content" id="modal-content-${row.ID}">
                                                        <span class="close" id="close-${row.ID}">&times;</span>
                                                        <form action="Edit?ID=${row.ID}" method="POST">
                                                            <div class="new-flex">                                                                                       
                                                                <h3>Your new caption:</h3>     
                                                                <textarea rows="4" cols="50" name="captionn">
                                                                    ${row.caption}
                                                                </textarea>
                                                                <h3>Choose new category:</h3>
                                                                <select name="categoryn">
                                                                    <option value="animal">Animal</option>
                                                                    <option value="potrait">Portrait</option>
                                                                    <option value="landscape">Landscape</option>
                                                                    <option value="sport">Sport</option>
                                                                    <option value="other">Other</option>
                                                                </select>
                                                                <input type="submit" value="Edit" name="edit" />        
                                                                <img  src="${pageContext.servletContext.contextPath}/upload?ID=${row.ID}" alt=${row.ID}/>
                                                            </div>
                                                        </form>                                     
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>   
                                </div>
                            </div>
                        </c:forEach>
                    </div>


                    <div class="third">

                    </div>
                </div>

            </div>
            <script>
                // Get the modal
                var modal = document.getElementById('myModal');

                // Get the button that opens the modal
                var btn = document.getElementById("myBtn");

                // Get the <span> element that closes the modal
                var span = document.getElementsByClassName("close")[0];

                // When the user clicks the button, open the modal 
                btn.onclick = function () {
                    modal.style.display = "block";
                };

                // When the user clicks on <span> (x), close the modal
                span.onclick = function () {
                    modal.style.display = "none";
                };

                // When the user clicks anywhere outside of the modal, close it
                window.onclick = function (event) {
                    if (event.target === modal) {
                        modal.style.display = "none";
                    }
                };

            </script>
            <script>
                $(document).ready(function () {
                    var someText = "<%=session.getAttribute("login")%>";
                    var email = "<%=session.getAttribute("email")%>";
                    if (someText === "login") {
                        alert("Welcome " + email);
                    }
                    console.log(someText);

                });

            </script>
            <script>
                $(document).ready(function () {
                    var check = "<%=session.getAttribute("password")%>";

                    $("#change").submit(function (event) {

                        var oldpassword = $("#oldpassword").val();
                        var password = $("#newpassword").val();
                        var confirmPassword = $("#newconfirmpassword").val();

                        console.log(oldpassword);
                        console.log(password);
                        console.log(confirmPassword);
                        if (oldpassword === check && oldpassword !== null && password !== null && confirmPassword !== null && password === confirmPassword)
                        {
                            alert("Congratulations. You have successfully changed your password!");
                        } else
                        {
                            event.preventDefault();
                            alert("Your current password is wrong or something is missing !! Please input again");
                        }

                    });
                });

            </script>

    </body>
</html>
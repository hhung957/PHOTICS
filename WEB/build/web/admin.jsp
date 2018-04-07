<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Admin page</h1>

        <table border = "1" width = "100%">
            <sql:setDataSource var = "database" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/photics" 
                               user="root" password=""/>
            <sql:query dataSource="${database}" sql="SELECT * FROM user WHERE NOT email = 'admin@yahoo.com'" var="result"/>

            <tr>
                <th>Email</th>
                <th>Action</th>
            </tr>

            <c:forEach var = "row" items = "${result.rows}">
                <tr>
                    <td><c:out value = "${row.email}"/></td>
                    <td><a href="Deleteacc?email=${row.email}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
        <table border = "1" width = "100%">
            <sql:setDataSource var = "database" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/photics" 
                               user="root" password=""/>
            <sql:query dataSource="${database}" sql="SELECT * FROM image WHERE NOT email = 'admin@yahoo.com'" var="result"/>

            <tr>
                <th>Picture</th>
                <th>Caption</th>
                <th>Action</th>
            </tr>

            <c:forEach var = "row" items = "${result.rows}">
                <tr>
                    <td><img  src="${pageContext.servletContext.contextPath}/upload?ID=${row.ID}" alt="${row.ID}" height="200" width="200"/> by ${row.email} </td>
                    <td>${row.caption}</td>
                    <td><a href="Delete?ID=${row.ID}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

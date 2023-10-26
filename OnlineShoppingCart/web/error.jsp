<%-- 
    Document   : error
    Created on : Oct 26, 2023, 1:11:45 AM
    Author     : Phoom1645
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Updating Notification</title>
    </head>
    <body>
        <h1><%= request.getAttribute("errMsg")%></h1>
        <a href="showAddMovies.jsp">Back to Menu</a>
    </body>
</html>

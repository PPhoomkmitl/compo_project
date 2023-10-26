<%-- 
    Document   : showConfirmOrder
    Created on : Oct 26, 2023, 1:10:52 AM
    Author     : Phoom1645
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Employee</title>
    </head>
    <body>
        <h1>Your Order is confirmed!</h1>
        <h1><%=request.getAttribute("totalText")%> </h1>
    </body>
</html>

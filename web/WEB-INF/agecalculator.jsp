<%-- 
    Document   : agecalculator
    Created on : 29-Jan-2023, 7:17:39 PM
    Author     : mmcka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator!</h1>
        <form method="post" action="age">
            Enter your age: <input type="number" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
    <p1>${calculateAge}</p1>
    <p1>${errorMessage}</p1>
    </body>
</html>

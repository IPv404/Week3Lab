<%-- 
    Document   : agecalculator
    Created on : 29-Jan-2023, 7:17:39 PM
    Author     : Zeina Mint
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator!</h1>
        <form method="post" action="age">
            Enter your age: <input type="number" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
    <p1>${message}</p1><br>
    
    <a href="arithmetic" target="_blank">Arithmetic Calculator</a>
    </body>
</html>

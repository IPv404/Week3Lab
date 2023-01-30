<%-- 
    Document   : arithmeticcalculator
    Created on : 29-Jan-2023, 8:31:00 PM
    Author     : Zeina Mint
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="post" action="arithmetic">
            First: <input type="text" name="num1" value="${num1}"><br>
            Second: <input type="text" name="num2" value="${num2}"><br>
           
            <input type="submit" value="+" name="submit" >
            <input type="submit" value="-" name="submit" >
            <input type="submit" value="*" name="submit">
            <input type="submit" value="%" name="submit" >
            
        </form>
            
        <p>Result: ${result}</p>
        
        <a href="Age Calculator">Age Calculator</a>
    
    </body>
</html>

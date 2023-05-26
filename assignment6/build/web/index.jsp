<%-- 
    Document   : index
    Created on : 26 May, 2023, 4:13:00 PM
    Author     : Ayan Ghosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        
        <h1>Assignment6</h1>
        <form action="insert.jsp" method="post">
            <input type="text" placeholder="first name" name="f_name"><br>
        <input type="text" placeholder="last name" name="l_name"><br>
        <input type="number" name="age" id="" placeholder="age"><br>
        <button type="submit">Insert</button>
    </form> 
    </body>
</html>


<%-- 
    Document   : CalcJSP
    Created on : 22/03/2022, 11:12:17 PM
    Author     : Camilo Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="CalcServlet" method="POST">
            <input type="text" name="valor1"  />
            <input type="text" name="valor2"  />
            <select name="operaciones">
                <option value="sumar" >Sumar</option>
                <option value="resta" >Restar</option>
                <option value="multiplicacion"> Multiplicar</option>
                <option value="division">Dividir</option>
                <option value="modulo">Modulo</option>
                <option value="elevado">Elevado</option>
            </select>
            <input type="submit" value="send" name="send" />
        </form>
    </body>
</html>

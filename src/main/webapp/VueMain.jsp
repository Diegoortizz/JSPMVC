<%-- 
    Document   : VueMain
    Created on : 7 nov. 2018, 13:38:08
    Author     : Diego
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Saisie d'un tableau de remise </title>
    </head>
    <body>
        <p> ${taille} </p>

        <table border=2>
            <tr> <th>Id</th> <th>Name</th> <th>Address</th> </tr>

            <c:forEach items="${remises}" var="element"> 
                <tr> <td>${element.code}</td> <td> <fmt:formatNumber minIntegerDigits="2" minFractionDigits="2" maxFractionDigits="2" value="${element.taux}"/> % </td> </tr>
            </c:forEach>
        </table>
        
    </body>
</html>
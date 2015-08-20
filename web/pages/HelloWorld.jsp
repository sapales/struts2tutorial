<%-- 
    Document   : HelloWorld
    Created on : 13-ago-2015, 11:26:43
    Author     : Santiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Struts 2 Hello World (Pages) Application!</title>
    </head>
    <body>
        <h2><s:property value="message" /></h2>
        <p>Current date and time is: <b><s:property value="currentTime" /></b></p>
    </body>
</html>

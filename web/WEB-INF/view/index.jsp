<%--
  Created by IntelliJ IDEA.
  User: anh dung
  Date: 10/11/2019
  Time: 4:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/translate" method="post">
    <h1>Dictionary</h1>
    <label>Word</label>
    <p><input type="text" placeholder="Enter the word" name="word"></p>
    <p><input type="submit" value="Translate"></p>
    <br/>
    <p> is :${result}</p>
  </form>
  </body>
</html>

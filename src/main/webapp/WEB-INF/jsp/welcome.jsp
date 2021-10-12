<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <link href="" rel="stylesheet">
    <link rel="stylesheet" href="webjars/bootstrap/3.3.5/css/bootstrap.css">
</head>
<body>
<%@ include file="common/navbar.jspf" %>
<br>

<h2 style="text-align: center">Hi! ${name}, Welcome to the Todo App.</h2>

<br>

<ul>
<li><a href="/todo">Click here</a>, to see your Todo-List.</li>
<li><a href="/add-todo">Click here</a>, to add a task to your List.</li>
</ul>

<script src="webjars/bootstrap/3.3.5/js/bootstrap.js"></script>
</body>
</html>
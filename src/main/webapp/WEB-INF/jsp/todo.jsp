<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>todo</title>
    <link href="" rel="stylesheet">
    <link rel="stylesheet" href="webjars/bootstrap/3.3.5/css/bootstrap.css">
</head>
<body>

<h2 style="text-align: center; font-family:serif">Hey ${name}! Here is all the things you need to complete.</h2>

<br>
<div style = "margin: 5px">
<table class="table table-striped">
      <thead>
           <tr>
                  <th>Description</th>
                  <th>Date</th>
                  <th>Completed</th>
                  <th></th>
           </tr>
      </thead>
      <tbody>
                  <c:forEach items="${todos}" var="todo">
            <tr>
                   <td>${todo.desc}</td>
                   <td>${todo.targetDate}</td>
                   <td>${todo.done}</td>
                   <td><a type=button class="btn btn-danger" href="/delete-todo?id=${todo.id}">Delete</a></td>
            </tr>
                  </c:forEach>
      </tbody>
</table>
</div>

<br>
<div style = "text-align: center">
<a href="/welcome"><button class="btn btn-info">HomePage</button></a>
</div>

<script src="webjars/bootstrap/3.3.5/js/bootstrap.js"></script>
</body>
</html>
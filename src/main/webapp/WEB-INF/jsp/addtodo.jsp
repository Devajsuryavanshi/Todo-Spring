<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add todo</title>
    <link href="" rel="stylesheet">
    <link rel="stylesheet" href="webjars/bootstrap/3.3.5/css/bootstrap.css">
</head>

<body>
<%@ include file="common/navbar.jspf" %>
<br>
<h1 style="text-align: center">Add a task!</h1>

<form:form method="post" style="margin: 10px" modelAttribute="todo">
<form:hidden path="id"/>

<fieldset class="form-group">
<form:label path="desc">DESCRIPTION</form:label>
<form:input type="text" path="desc" class="form-control" required="required"/>
<form:errors path="desc" cssClass="text-danger"/>
</fieldset>

<fieldset class="form-group">
<form:label path="targetDate">TARGET DATE</form:label>
<form:input type="text" path="targetDate" class="form-control" required="required"/>
<form:errors path="targetDate" cssClass="text-danger"/>
</fieldset>

<input type="submit" class="btn btn-success">
</form:form>

<br>
<mark>${message}</mark>
<div style="text-align: center">
<a type="button" href="/todo" class="btn btn-info">Show Todos</a>
</div>

<script src="webjars/bootstrap/3.3.5/js/bootstrap.js"></script>
</body>

</html>
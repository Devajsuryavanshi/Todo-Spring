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
<h1 style="text-align: center">Add a task!</h1>

<form method=POST style="margin: 10px">
<fieldset class="form-group">
<label>DESCRIPTION</label>
<input id="desc" type="text" name="desc" class="form-control" required>
</fieldset>
<input type="submit" class="btn btn-success">
</form>

<br>
<mark>${message}<mark>
<div style="text-align: center"><a type="button" href="/todo" class="btn btn-info">Show Todos</a></div>

<script src="webjars/bootstrap/3.3.5/js/bootstrap.js"></script>
</body>

</html>
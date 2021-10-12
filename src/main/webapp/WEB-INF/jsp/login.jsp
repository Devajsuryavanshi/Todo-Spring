
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Spring-First</title>
    <link href="" rel="stylesheet">
    <link rel="stylesheet" href="webjars/bootstrap/3.3.5/css/bootstrap.css">
</head>
<body>
<%@ include file="common/navbar.jspf" %>
<br>
      <div class='login'  style="text-align: center; display:block">
          <div class='loginLogo'>
              <h2>Sign in</h2>
          </div>
          <div id= "form" style="text-align:center; display:inline-block">
          <table>
            <tr>
                <td>
                    <form autocomplete="off" method="post">
                        <div class="form-group">
                            <label for="name">Name</label>
                            <input type="text" class="form-control" id="Name" name="name" required>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" id="password" name="password" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <input type="submit" name="Login" class="btn btn-success">
                            <button onclick="regPage()" class="btn btn-success">Register</button>
                        </div>
                    </form>
                    <p class="text-danger">${message}</p>
                </td>
            </tr>
            </table>
        </div>
      </div>
      <script type="text/javascript">
      function regPage(){
    	  window.location.href="/register";
      }
      </script>
<script src="webjars/bootstrap/3.3.5/js/bootstrap.js"></script>
</body>
</html>
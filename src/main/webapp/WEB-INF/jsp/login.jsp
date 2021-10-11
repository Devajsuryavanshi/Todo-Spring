
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
<h1 style="text-align: center">Welcome to Spring Login Page</h1>
<br>
      <div class='login'>
          <div class='loginLogo'>
              <h1>Sign in</h1>
          </div>
          <div id= "form" style="text-align: center;">
          <table>
            <tr>
                <td>
                    <form autocomplete="off" method="post">
                        <div class="form-group">
                            <label for="name">Name</label>
                            <input type="text" id="Name" name="name" required>
                        </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" id="password" name="password" required>
                        </div>
                        <div class="form-group">
                            <input type="submit" name="Login" class="button btn">
                            <button onclick="regPage()" class="button btn">Register</button>
                        </div>
                    </form>
                    <mark>${message}</mark>
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
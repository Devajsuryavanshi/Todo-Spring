<%@ include file="common/header.jspf" %>
<body>
<%@ include file="common/navbar.jspf" %>
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
                  <th></th>
           </tr>
      </thead>
      <tbody>
                  <c:forEach items="${todos}" var="todo">
            <tr>
                   <td>${todo.desc}</td>
                   <td><fmt:formatDate value="${todo.targetDate}"/></td>
                   <td>${todo.done}</td>
                   <td><a type=button class="btn btn-success" href="/update-todo?id=${todo.id}">Update</a></td>
                   <td><a type=button class="btn btn-danger" href="/delete-todo?id=${todo.id}">Delete</a></td>
            </tr>
                  </c:forEach>
      </tbody>
</table>
</div>

<br>
<div style = "text-align: center">
<a href="/welcome"><button class="btn btn-info">HomePage</button></a>
<a href="/add-todo"><button class="btn btn-info">Add New</button></a>
</div>

<%@ include file="common/footer.jspf" %>

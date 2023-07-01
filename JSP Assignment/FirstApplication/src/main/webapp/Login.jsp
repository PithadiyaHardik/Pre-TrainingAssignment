<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
      crossorigin="anonymous"
    />
</head>
<body>
		<% if(session.getAttribute("username")!=null)
		{
			response.sendRedirect("Home.jsp");
		}
		%>

        <form
          style="width: 430px; margin-top:130px;background-color: rgb(227, 232, 232);"
          class="container flex-column shadow d-flex justify-content-center align-items-center py-5 px-3 rounded"
          id="loginForm" method="post" action="LoginServlet" onsubmit="return validateLogin()"
        >
          <h2>Login</h2>
          <input
            type="text"
            placeholder="Username"
            required
            class="form-control mt-4"
            name="username"
          />
          <input
            type="password"
            placeholder="password"
            class="form-control mt-4"
            required
            name="password"
          />
          <button style="width: 200px;" id="loginButton" class="btn btn-outline-success mt-4">
            Login
          </button>
          <a href="Register.jsp" class="text-success">Do not have account?</a>
          <label class="text-danger bold" id="msg-label-login">${sessionScope.loginmessage}</label>
          
        </form>
</body>
<script src="LoginRegisterScript.js"></script>
</html>
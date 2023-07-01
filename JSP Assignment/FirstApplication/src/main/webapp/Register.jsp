<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Yourself</title>
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
          style="width: 430px; margin:50px; background-color: rgb(227, 232, 232);"
          class="container flex-column shadow d-flex justify-content-center align-items-center py-5 px-3 rounded"
          id="registerForm" method="post" action="RegisterServlet" onsubmit="return validateRegister()"
        >
          <h2>Register</h2>
          <input
            class="form-control mt-4"
            type="text"
            placeholder="Full Name"
            required
            name="name"
          />
          <input
            type="text"
            type="text"
            placeholder="Username"
            class="form-control mt-4"
            required
            name="username"
          />
          <input
            type="email"
            placeholder="email"
            name="email"
            class="form-control mt-4"
          />
          <input
            type="password"
            placeholder="password"
            class="form-control mt-4"
            required
            name="password"
          />
          <input
            type="password"
            placeholder="confirm password"
            class="form-control mt-4"
            required
            name="confirmpassword"
          />
          <button  id="registerButton" style="width: 200px;" class="btn btn-outline-primary mt-4">
            Register
          </button>
          <label class="text-danger" id="msg-label-register">${sessionScope.registermessage}</label>
        </form>
</body>
 <script src="LoginRegisterScript.js"></script>
</html>
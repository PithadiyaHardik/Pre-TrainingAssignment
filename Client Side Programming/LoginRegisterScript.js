let loginForm = document.getElementById("loginForm");
let registerForm = document.getElementById("registerForm");
let loginLabel = document.getElementById("msg-label-login");
let registerLabel = document.getElementById("msg-label-register");
const passwordRegex = /[a-z|A-Z]+[0-9]+[!@#$%^&]+/;
loginForm.addEventListener("submit", (e) => {
  e.preventDefault();
  let username = loginForm["username"].value.trim();
  let password = loginForm["password"].value.trim();
  if (username === "" || password === "") {
    loginLabel.innerHTML = "Username or password is blank";
  } else if (!passwordRegex.test(password)) {
    loginLabel.innerHTML =
      "Password should start with a alphabet followed by digit annd followd by special character.";
  } else {
    window.location.href = "home.html";
  }
});

registerForm.addEventListener("submit", (e) => {
  e.preventDefault();
  let name = registerForm["fullname"].value.trim();
  let email = registerForm["email"].value.trim();
  let username = registerForm["username"].value.trim();
  let password = registerForm["password"].value.trim();
  let confirmpassword = registerForm["confirmpassword"].value.trim();
  if (
    name === "" ||
    email === "" ||
    confirmpassword === "" ||
    username === "" ||
    password === ""
  ) {
    registerLabel.innerHTML = "Invalid Data";
  } else if (password != confirmpassword) {
    registerLabel.innerHTML = "Psssword and confirm password is not same";
  } else if (!passwordRegex.test(password)) {
    registerLabel.innerHTML =
      "Password should start with a alphabet followed by digit annd followd by special character.";
  } else {
    window.location.href = "home.html";
  }
});

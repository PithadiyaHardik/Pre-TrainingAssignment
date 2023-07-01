let loginButton = document.getElementById("loginButton");
let registerButton = document.getElementById("registerButton");
let loginLabel = document.getElementById("msg-label-login");
let registerLabel = document.getElementById("msg-label-register");
const passwordRegex = /[a-z|A-Z]+[0-9]+[!@#$%^&]+/;

const validateLogin=()=>{
let username = loginForm["username"].value.trim();
  let password = loginForm["password"].value.trim();
  if (username === "" || password === "") {
    loginLabel.innerHTML = "Username or password is blank";
    return false;
  } else if (!passwordRegex.test(password)) {
    loginLabel.innerHTML =
      "Password should start with a alphabet followed by digit annd followd by special character.";
  	return false;
  } else {
    return true;
  }
}

const validateRegister=()=>{
	let name = registerForm["name"].value.trim();
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
    return false;
  } else if (password != confirmpassword) {
    registerLabel.innerHTML = "Psssword and confirm password is not same";
    return false;
  } else if (!passwordRegex.test(password)) {
    registerLabel.innerHTML =
      "Password should start with a alphabet followed by digit annd followd by special character.";
  		return false;
  } else {
    return true;
  }
	
}


registerButton.addEventListener("click", (e) => {
  console.log("called");
  
});

/*const {default : axios} =require("axios");

console.log("Funciona js09 con NMP");

fetch("https://reqres.in/api/users?page=2")
.then((data) => data.json() )
.then(dataJson => console.log(dataJson));

axios.get("https://reqres.in/api/users?page=2")
.then(res) => console.log(res));

axios.post ()*/

console.log("Estoy en JS09 con NPM");

fetch("https://reqres.in/api/users?page=2")
  .then((data) => data.json())
  .then((dataJson) => console.log(dataJson));

axios.get("https://reqres.in/api/users?page=2").then((res) => console.log(res));


fetch("https://reqres.in/api/users", {
  method: "POST",
  body: {
    name: "Manuel",
    job: "Torres",
  },
})
  .then((response) => response.json())
  .then((data) => {
    console.log("Success: ", data);
  })
  .catch((error) => {
    console.error("Error: ", error);
  });

axios
  .post("https://reqres.in/api/users", {
    name: "Manuel",
    job: "Torres",
  })
  .then((response) => console.log(response))
  .catch((error) => console.log(error));


  let botonFormulario = document.getElementById("todos");
  botonFormulario.style.display = "none";
  botonFormulario.style.visibility = "hidden";

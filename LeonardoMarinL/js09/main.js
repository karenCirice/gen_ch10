//const { default: axios } = require("axios"); <- no se utiliza porque esto es para node.js

//const { default: axios } = require("axios");

console.log("Estoy en js09 con NPM");

fetch("https://reqres.in/api/users?page=2")
  .then((data) => data.json())
  .then((dataJason) => console.log(dataJason));

//Sirven para lo mismo, pero el axios presenta un código más limpio
axios.get("https://reqres.in/api/users?page=2").then((res) => console.log(res));

//esto es igual para comparar el fetch y axios
fetch("https://reqres.in/api/users", {
    method: "POST",
    body: {
        name: "Manuel",
        job: "Torres",
    },
})
.then((response)=>response.json())
.then((data)=>{
    console.log("Succes: ",data);
})
.catch((error)=>{
    console.log("Error: ",error);
})

axios
  .post("https://reqres.in/api/users", {
    name: "Manuel",
    job: "Torres",
  })
  .then((response) => console.log(response))
  .catch((error) => console.log(error));

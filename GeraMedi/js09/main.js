//const { default: axios } = require("axios");

console.log("Estas en la carpeta js09 dentro del repositorio gench10");

//https://reqres.in/api/users?page=2

/* fetch("https://reqres.in/api/users?page=2")
.then((data)=>data.json())
.then(dataJson => console.log(json)) */

/* Para el fetch con get con AXIOS*/
axios.get("https://reqres.in/api/users?page=2")
.then (res => console.log(res))

/* Para el fetch con post con AXIOS*/
axios.post("https://reqres.in/api/users",{
    name: "Manuel",
    job: "Torres",
  })
  .then((response)=> console.log(response))
  .catch((error) => console.log(error));


  /* FETCH NORMAL CON POST (SOLO PARA COMPARAR)*/
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
  





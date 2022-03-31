//const { default: axios } = require("axios");

console.log("Estoy en JS09 con NPM");

//METODO FETCH
fetch("https://reqres.in/api/users?page=2")
    .then(data => data.json())
    .then(dataJson => console.log(dataJson))

// METODO AXIOS CONVIERTE A JSON DIRECTAMENTE si usamos Axios
axios
    .get("https://reqres.in/api/users?page=2")
    .then(res => console.log(res));

//METODO POST USANDO FETCH -> la respuesta si da el name  y el ID number
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
    .then(response => console.log(response))
    .catch(error => console.log(error));

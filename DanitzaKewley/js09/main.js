//const { default: axios } = require("axios");

console.log("Estoy en js09");

/* Asi se hace con fetch
fetch("https://reqres.in/api/users?page=2")
.then ((data) => {data.json()})
.then (dataJson =< console.log(dataJson)) */

axios.get("https://reqres.in/api/users?page=2").then((res) => console.log(res));

/* Así se hace el post con fetch */
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
  .post("https://reqres.in/api/users?page=2", {
    name: "Manuel",
    job: "Torres",
  })
  .then((response) => console.log(response))
  .catch((error) => console.log(error));

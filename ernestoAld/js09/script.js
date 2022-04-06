/* const { default: axios } = require("axios"); */

/* const { default: axios } = require("axios"); */

console.log("JS09 con NPM");

/* 
fetch("https://reqres.in/api/users?page=2")
.then(data => data.json())
.then(dataJson => console.log(dataJson)) */

axios
  .get("https://reqres.in/api/users?page=2")
  .then((response) => console.log(response));

axios.post("https://reqres.in/api/users", {
  name: "Ernesto",
  job: "developer",
})
.then(response => console.log(response))
.catch(error => console.log(`Error: ${error} `));

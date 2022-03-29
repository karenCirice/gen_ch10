//const { default: axios } = require("axios");
//const { default: axios } = require("axios");

console.log("Jso9 con NPM");

axios.get("https://reqres.in/api/users?page=2")
.then(res => console.log(res));

axios.post("https://reqres.in/api/users",{
    name: "Victor",
    job: "student"
})
    .then((response) => console.log(response))
    .catch((error) => console.log(error));
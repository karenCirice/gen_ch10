// const { default: axios } = require("axios");

console.log("Esto en JS09 con NPM...");

// GET usando axios
axios.get("https://reqres.in/api/users?page=2")
.then((res)=> console.log(res));

// POST usando axios
axios.post("https://reqres.in/api/users",
{
    name: "Manuel",
    job: "Torres",
})
.then((response)=> console.log(response))
.catch((error)=>console.log(error));
//const { default: axios } = require("axios");

//const { default: axios } = require("axios");

console.log("Esto en js09");

/* fetch("https://reqres.in/api/users?pages=2")
    .then ( (data) => data.json() )
    .then (dataJson => console.log(dataJson)) */

axios.get("https://reqres.in/api/users?pages=2")
    .then ( res => console.log(res))

axios.post("https://reqres.in/api/users", {
        name: "Manuel",
        job: "Torres",
    }
)
.then( response => console.log(response) )
.catch( error => console.log(error) );
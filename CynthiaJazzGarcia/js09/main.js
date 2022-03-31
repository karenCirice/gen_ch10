//const { default: axios } = require("axios");

const { default: axios } = require("axios");

console.log ("estoy en js09");

fetch("https://reqres.in/api/users?page=2")
.then (data => data.json())
.then (dataJson => console.log(dataJson))

axios.get("https://reqres.in/api/users?page=2") //con axios ya nos agrega en automatico el JSON
.then ( res => console.log(res))

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
  }); //accion con FETCH


axios.post ("https://reqres.in/api/users",
{
    name:"Manuel",
    job:"Torres",
}
)
.then( response => console.log (response))
.catch((error) => console.log (error));
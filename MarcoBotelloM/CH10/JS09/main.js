// const { default: axios } = require("axios")

console.log("Esto es JS09...")

// fetch("https://reqres.in/api/users?page=2")
// .then (data => data.json())
// .then(datajson => console.log(datajson))

axios.get("https://reqres.in/api/users?page=2")
.then (res => console.log(res))

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

axios.post("https://reqres.in/api/users?page=2", {
    name: "Marco",
    job: "Programador",
})
.then((response) => console.log(response))
.catch((error) => console.log(error));

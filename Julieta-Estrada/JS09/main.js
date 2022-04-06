//const {default:axios} = require("axios");

//const { default : axios}= require("axios");

console.log("Estoy en JS09 con MPM")

fetch("https://reqres.in/api/users?page=2")
    .then((data)=> data.json())
    .then((dataJson) => console.log(dataJson));

axios.get("https://reqres.in/api/users?page=2")
.then((res)=> console.log(res));

fetch("https://reqres.in/api/users",{
    method: "POST",
    body: {
        name:"Julieta",
        job: "Estrada",
    },
})
    .then((response)=>response.json())
    .then((data)=>{
        console.log("Success: ", data);
    })
    .catch((error)=>{
        console.error("Error: ", error);
    });

    axios
    .post("https://reqres.in/api/users",{
        name:"Julieta",
        job: "Estrada",
    })
    .then((response)=> console.log(response))
    .catch((error)=> console.log(error));
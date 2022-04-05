//const { default: axios } = require("axios");

console.log("Programa corriendo correctamente JS09");

/* fetch("https://reqres.in/api/users?page=2")
    .then(data => data.json())
    .then(dataJson => console.log(dataJson)) */

axios.get("https://reqres.in/api/users?page=2")
    .then(res => console.log(res));


axios.post('https://reqres.in/api/users', {
    name: 'Eduardo Campos',
    job: 'ISC'
})
    .then((response) => console.log(response))
    .catch((error) => console.log(error));
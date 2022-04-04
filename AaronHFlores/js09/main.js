//const { default: axios } = require("axios");

console.log("Estoy en js09 con npm");

axios.get("https://reqres.in/api/users?page=2")
    .then(res => console.log(res))

axios.post("https://reqres.in/api/users", {
    name: "Manuel",
    job: "Torres"
})
    .then(response => console.log(response))
    .catch((error) => console.log(error))
/* function searchUsers() {
    axios.get("https://reqres.in/api/users?page=2")
        .then(res => res.json())
        .then(users => {
            console.log(users);
            let tBody = document.getElementById("tBody");

            for (const us of users.data) {
                tBody.innerHTML += `
            <tr>
            <td>${us.id}</td>
            <td>${us.first_name}</td>
            <td>${us.last_name}</td>            
            <td>${us.email}</td>                 
            <td><img src = ${us.avatar}></td>
            </tr>`;
            }
        })
        .catch(error => {
            console.log("La solicitud causo error", error);
        })
}  */
console.log("Ejercicio JS07");

function searchUsers() {
    fetch("https://reqres.in/api/users?page=1")
        .then(response => response.json())
        .then(users => {
            console.log(users);
            let tBody = document.getElementById("tBody");

            for (const us of users.data) {
                tBody.innerHTML += `
                <tr>
                <td class="text-danger">${us.id}</td>
                <td class="text-danger">${us.first_name}</td>
                <td class="text-danger">${us.last_name}</td>            
                <td class="text-danger">${us.email}</td>                 
                <td class="text-danger"><img class="rounded-circle" src = ${us.avatar}></td>
                </tr>`;
            }
        })
        .catch(error => {
            console.log("La solicitud causo error", error);
        })
}
/* 
Funcion para mostrar la otra mitad del json */
function searchUsers2() {
    fetch("https://reqres.in/api/users?page=2")
        .then(response => response.json())
        .then(users => {
            console.log(users);
            let tBody = document.getElementById("tBody");

            for (const us of users.data) {
                tBody.innerHTML += `
                <tr>
                <td class="text-danger">${us.id}</td>
                <td class="text-danger">${us.first_name}</td>
                <td class="text-danger">${us.last_name}</td>            
                <td class="text-danger">${us.email}</td>                 
                <td class="text-danger"><img class="rounded-circle " src = ${us.avatar}></td>
                </tr>`;
            }
        })
        .catch(error => {
            console.log("La solicitud causo error", error);
        })
}